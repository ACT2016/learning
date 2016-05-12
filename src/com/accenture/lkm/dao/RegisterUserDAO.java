package com.accenture.lkm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.acceture.lkm.beans.RegisterUser;

public class RegisterUserDAO {


    
    
    public RegisterUser insertByUser(String fname, String lname, String email, String clevel, String sname, String password) {
    	RegisterUser user = new RegisterUser();
        Connection c = null;
    	String sql = "INSERT INTO registeruser(firstname,lastname,email,careerlevel,supname,password) values("+fname+","+lname+","+email+","+clevel+","+sname+","+password+")";
        try {
            c = ConnectionHelper.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            int rs = ps.executeUpdate();
            
            if (rs > 0) {
                System.out.println("A row was inserted.");
                return user;
            }
            else
            	return null;
           
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        //return user;
    }
    
    
   
    protected RegisterUser processRow(ResultSet rs) throws SQLException {
    	RegisterUser user = new RegisterUser();
        
        user.setFirstName(rs.getString("firstName"));
    	user.setLastName(rs.getString("lastName"));
    	user.setEmail(rs.getString("email"));
    	user.setcLevel(rs.getInt("cLevel"));
    	user.setsName(rs.getString("sName"));
    	user.setPassword(rs.getString("password"));
        
        return user;
    }
    
    protected RegisterUser processSummaryRow(ResultSet rs) throws SQLException {
    	RegisterUser user = new RegisterUser();
    	
    	 user.setFirstName(rs.getString("firstName"));
     	user.setLastName(rs.getString("lastName"));
     	user.setEmail(rs.getString("email"));
     	user.setcLevel(rs.getInt("cLevel"));
     	user.setsName(rs.getString("sName"));
     	user.setPassword(rs.getString("password"));
        
    	return user;
    }
    


}
