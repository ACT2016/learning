package com.accenture.lkm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.acceture.lkm.beans.RegisterUser;

public class RegisterUserDAO {


    
    
    public RegisterUser findByUserName(String name, String password) {
    	RegisterUser user = new RegisterUser();
        Connection c = null;
    	String sql = "INSERT INTO registeruser(firstname,lastname,email,careerlevel,supname,password) values(firstname,lastname,email,clevel,supname,password);";
        try {
            c = ConnectionHelper.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user=processSummaryRow(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        return user;
    }
    
    
   
    protected RegisterUser processRow(ResultSet rs) throws SQLException {
    	RegisterUser user = new RegisterUser();
        
        user.setFirstName(rs.getString("firstName"));
    	user.setLastName(rs.getString("lastName"));
    	user.setUserName(rs.getString("userName"));
    	user.setPassword(rs.getString("password"));
        
        return user;
    }
    
    protected RegisterUser processSummaryRow(ResultSet rs) throws SQLException {
    	RegisterUser user = new RegisterUser();
    	
    	user.setFirstName(rs.getString("firstName"));
    	user.setLastName(rs.getString("lastName"));
    	user.setUserName(rs.getString("userName"));
    	user.setPassword(rs.getString("password"));
        
    	return user;
    }
    


}
