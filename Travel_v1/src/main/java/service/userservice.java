package service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.DB;
import model.usermodel;




public class userservice {

	
	//ex)회원가입
	
	//비밀번호 변경
	
	//회원 삭제  등등
	
	//아이디 찾기 (로그인)
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
        }		catch(SQLException e)
		{
			e.printStackTrace();
			return -2;	//오류
		}
		finally {
			
			DB.close(conn,pstmt,rs);
		}
	
	}

}
