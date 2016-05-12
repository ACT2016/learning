package com.accenture.lkm.resources;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.accenture.lkm.dao.UserDAO;
import com.acceture.lkm.beans.RegisterUser;
import com.acceture.lkm.beans.User;

@Path("/user")
public class UserResource {
	@Context 
	private HttpServletRequest request;
	UserDAO dao = new UserDAO();

	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public User findById(@QueryParam("username") String username,@QueryParam("password") String password) {
		return this.authenticate(username, password);
		
	}
	
	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public User findByIdPost(@QueryParam("username") String username,@QueryParam("password") String password) {
		 return this.authenticate(username, password);
	
	}
	
	private User authenticate(String username, String password){
		User user= dao.findByName(username,password);
		if(user.getId()!=0){
			
			request.getSession(true).setAttribute("user",user);
		}	
		return user ;
	}
	
	@POST @Path("/logout")
	@Produces({ MediaType.TEXT_HTML, MediaType.TEXT_XML })
	public String logout() {
			request.getSession().invalidate(); 
		return "true";
	
	}
	
	@POST
	@Path("/register")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public User validateUser(@QueryParam("fname") String fname,@QueryParam("lname") String lname,@QueryParam("email") String email,@QueryParam("eId") String enterpriseId,@QueryParam("sname") String sname,@QueryParam("password") String password) {
		User user = new User();
		user.setFirstName(fname);
		user.setLastName(lname);
		user.setUserName(email);
		user.setEnterpriseId(enterpriseId);
		user.setPassword(password);
		return dao.insertByUser	(user);
		
	}
	
}
