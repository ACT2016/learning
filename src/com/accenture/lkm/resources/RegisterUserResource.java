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
	public RegisterUser validateUser(@QueryParam("fname") String fname,@QueryParam("lname") String lname,@QueryParam("email") String email,@QueryParam("clevel") String clevel,@QueryParam("sname") String sname,@QueryParam("password") String password) {
		return this.insertRecord(fname,lname,email,clevel,sname, password);
		
	}
	
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public RegisterUser validateUserPost(@QueryParam("fname") String fname,@QueryParam("lname") String lname,@QueryParam("email") String email,@QueryParam("clevel") String clevel,@QueryParam("sname") String sname,@QueryParam("password") String password) {
		 return this.insertRecord(fname,lname,email,clevel,sname, password);
	
	}
	
	private RegisterUser insertRecord(String fname, String lname, String email, String clevel, String sname, String password){
		RegisterUser user= dao.insertByUser(fname,lname,email,clevel,sname, password);
		
		return user ;
	}
	
	
}
