package com.accenture.lkm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.acceture.lkm.beans.RegisterUser;
import com.acceture.lkm.beans.User;

/**
 * @author Christophe Coenraets
 */
public class UserDAO {

	public User findByName(String name, String password) {
		User user = new User();
		Connection c = null;
		String sql = "SELECT * from users where username='" + name + "' and password='" + password + "'";
		try {
			c = ConnectionHelper.getConnection();
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user = processSummaryRow(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
		return user;
	}

	public User insertByUser(User user) {
    	Connection c = null;
    	String sql="";
        try {
            c = ConnectionHelper.getConnection();
            
            PreparedStatement ps= c.prepareStatement("select userId from users where enterpriseid='"+user.getEnterpriseId()+"'");
            if(ps.executeQuery().getFetchSize()>0){
            	return null;
            }
            
            ps= c.prepareStatement("select max(userId)+1 from users");
            ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				user.setId(resultSet.getInt(1));
			}
			sql = "INSERT INTO `directory`.`users`(`userId`,`firstName`,`lastName`,`userName`,`password`,`roleId`,`enterpriseId`) values('"+user.getId()+"','"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getUserName()+"','"+user.getPassword()+"',2,'"+user.getEnterpriseId()+"')";
			ps = c.prepareStatement(sql);		 	
            int rs = ps.executeUpdate();
            
            if (rs > 0) {
                System.out.println("A row was inserted.");
            }
            else
            	return null;
           
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        return user;
    }

	protected User processRow(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("userId"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setRoleId(rs.getInt("roleId"));
		user.setEnterpriseId(rs.getString("enterpriseId"));
		return user;
	}

	protected User processSummaryRow(ResultSet rs) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("userId"));
		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		user.setRoleId(rs.getInt("roleId"));
		user.setEnterpriseId(rs.getString("enterpriseId"));
		return user;
	}

}
