package com.accenture.lkm.resources;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.accenture.lkm.dao.RegisterUserDAO;
import com.acceture.lkm.beans.RegisterUser;

@Path("/registeruser")
public class RegisterUserResource {
	@Context 
	private HttpServletRequest request;
	RegisterUserDAO dao = new RegisterUserDAO();

	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public RegisterUser findById(@QueryParam("username") String username,@QueryParam("password") String password) {
		return this.authenticate(username, password);
		
	}
	
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public RegisterUser findByIdPost(@QueryParam("username") String username,@QueryParam("password") String password) {
		 return this.authenticate(username, password);
	
	}
	
	private RegisterUser authenticate(String username, String password){
		RegisterUser user= dao.findByUserName(username,password);
		
		return user ;
	}
	
	
}
