package service;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.DB;
import model.usermodel;


public class userservice {

	//회원가입
	public int Signup(usermodel model)
	{
		String sql = "INSERT INTO user VALUES (?,?,?,?,?)";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;
		
		try
		{    
            pstmt = conn.prepareStatement(sql);        
            
            pstmt.setString(1, model.getId());
            pstmt.setString(2, model.getPwd());
            pstmt.setString(3, model.getName());
            pstmt.setDate(4, (Date) model.getDate());
            pstmt.setString(5, model.getGender());

            if(pstmt.executeUpdate() !=1)
            {
                return 0;		
            }
            return 1;			
        }
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;			
		}   
		finally 
		{	
			DB.close(conn,pstmt);
		}
    }
	
	//비밀번호 변경
	public int Updatepwd(String uppwd, String id)
	{
		String sql = "UPDATE user set password = ? where id = ?";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;
		
		try
		{
			pstmt = conn.prepareStatement(sql);
			
            pstmt.setString(1, uppwd);
            pstmt.setString(2, id);
            
            if(pstmt.executeUpdate() !=1)
            {
                return 0;		
            }       
            return 1;			
        }
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;			
		}  
		finally 
		{	
			DB.close(conn,pstmt);
		}
	}
	
	//비밀번호 확인
	public int Checkpwd(String pwd, String id)
	{	
		String sql = "SELECT password from user where id = ?";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null; 
		ResultSet rs = null;
		 
		try
		{
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
            if (rs.next()) 
            {
            	if(rs.getString(1).equals(pwd))
            		return 1;
                else
             	   return 0;	 //비밀번호 불일치
             } 
             return -1;	//비밀번호 없음
        }
		catch(SQLException e)
		{
			e.printStackTrace();
			return 0;
		} 
		finally 
		{	
			DB.close(conn, pstmt, rs);
		}
	}
	
	//회원 삭제 
	public int Deleteuser(String pwd)
	{
		String sql = "DELETE FROM user where password = ?";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;
		
		try
		{
            pstmt = conn.prepareStatement(sql);
           
            pstmt.setString(1, pwd);
            
            if(pstmt.executeUpdate() !=1)
            {
                return 0;	
            }       
            return 1;
        }
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}  
	}
	
	//회원 정보 불러오기
	public usermodel Selectuser(String id) 
	{
		String sql = "SELECT * FROM user where id = ?";
		Connection conn = DB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		usermodel user = new usermodel();
		
		try 
		{
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery(); 
			
			while (rs.next()) 
			{ 			
				user.setId(rs.getString(1));		//id
				user.setPwd(rs.getString(2));		//password
				user.setName(rs.getString(3));		//name
				user.setDate(rs.getDate(4));		//birth
				user.setGender(rs.getString(5));	//gender
			}
			
			return user;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		} 
		finally 
		{
			DB.close(conn, pstmt, rs);
		}
	}
	
	
	//로그인
	public  int findbyuserid(usermodel model)
	{
		String sql = "SELECT password FROM user WHERE id = ?";
		Connection conn=DB.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;  
		
		try
		{
            pstmt = conn.prepareStatement(sql);
           
            pstmt.setString(1, model.getId());
            
            rs = pstmt.executeQuery();
            if (rs.next()) 
            {
               if (rs.getString(1).equals(model.getPwd()))
            	   return 1;		//로그인 성공
               else
            	   return 0;	//비밀번호 불일치
            } 
            return -1;	//아이디가 없음
        }
		catch(SQLException e)
		{
			e.printStackTrace();
			return -2;	//오류
		}
		finally 
		{	
			DB.close(conn,pstmt,rs);
		}
	
	}

}
