package com.sitepk.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sitepk.entity.Site;

@Path("/")
public class HelloWorldResource {
	
	@Path("/helloworld.com")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Site getClichedMessage(){
		Site site = new Site();
		site.setSiteid("1");
		site.setName("aaa");
		return site;
	}
	
//	@Path("/user/add")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response addUser() {
//		return Response.status(Status.BAD_GATEWAY).build();
//	}
	
}
