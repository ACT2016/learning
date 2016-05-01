package com.accenture.lkm.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.accenture.lkm.dao.TrainingDAO;
import com.acceture.lkm.beans.Training;
import com.acceture.lkm.beans.User;

@Path("/training")
public class TrainingResource {
	@Context 	
	private HttpServletRequest request;
	TrainingDAO trainingDAO = new TrainingDAO();

	
	@GET@Path("/auth/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Training> findById(@QueryParam("username") String username,@QueryParam("password") String password) {
		
		User user= (User)request.getSession().getAttribute("user");
		return trainingDAO.findByUserID(user.getId());
		
	}
	
	@GET@Path("/all/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Training> findAll(@QueryParam("username") String username,@QueryParam("password") String password) {
		return trainingDAO.findAll();
		
	}
}
