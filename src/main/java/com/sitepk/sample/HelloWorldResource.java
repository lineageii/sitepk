package com.sitepk.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sitepk.entity.Person;
import com.sun.jersey.api.client.ClientResponse.Status;

@Path("/")
public class HelloWorldResource {
	@Path("/helloworld.com")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Person getClichedMessage(){
		Person person = new Person();
		person.setId(1);
		person.setName("hu jia");
		return person;
	}
	
	@Path("/user/add")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUser() {
		return Response.status(Status.BAD_GATEWAY).build();
	}
	
}
