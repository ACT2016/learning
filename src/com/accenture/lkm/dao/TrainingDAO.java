package com.accenture.lkm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.acceture.lkm.beans.Training;

/**
 * @author Christophe Coenraets
 */
public class TrainingDAO {

    
    
    public List<Training> findByUserID(int i) {
    	List<Training> training = new ArrayList<Training>();
        Connection c = null;
    	String sql = "select distinct d.trainingId, a.trainingName, a.trainingDesc, b.categoryId, categoryName,categoryDesc,status,active from training_status d left outer join "
    			+ "users c on d.userId=c.userId left outer join trainings a "
    			+ "on a.trainingId=d.trainingID left outer join category b on "
    			+ "a.categoryId=b.categoryId where d. userId like '"+i+"'";
        try {
            c = ConnectionHelper.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                training.add(processSummaryRow(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
		} finally {
			ConnectionHelper.close(c);
		}
        return training;
    }
    
    public List<Training> findAll() {
        List<Training> trainingList= new ArrayList<Training>();
         Connection c = null;
     	String sql = "select distinct d.trainingId, a.trainingName, a.trainingDesc, b.categoryId, categoryName,categoryDesc,status,active from training_status d left outer join "
     			+ "users c on d.userId=c.userId left outer join trainings a "
     			+ "on a.trainingId=d.trainingID left outer join category b on "
     			+ "a.categoryId=b.categoryId where d. userId like '%'";
         try {
             c = ConnectionHelper.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {
            	 trainingList.add(processSummaryRow(rs));
             }
         } catch (SQLException e) {
             e.printStackTrace();
             throw new RuntimeException(e);
 		} finally {
 			ConnectionHelper.close(c);
 		}
         return trainingList;
     }
    
   
     
    protected Training processSummaryRow(ResultSet rs) throws SQLException {
    	Training training = new Training();
    	training.setTrainingId(rs.getInt("trainingId"));
    	training.setTrainingName(rs.getString("trainingName"));
    	training.setTrainingDesc(rs.getString("trainingDesc"));
    	training.setCategoryId(rs.getInt("categoryId"));
    	training.setCategoryName(rs.getString("categoryName"));
    	training.setCategoryDesc(rs.getString("categoryDesc"));
        training.setStatus(rs.getInt("status"));
        training.setActive(rs.getInt("active"));
        return training;
    }
    
}

