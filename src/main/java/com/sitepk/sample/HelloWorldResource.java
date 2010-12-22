package com.sitepk.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sitepk.entity.Person;

@Path("/helloworld.com")
public class HelloWorldResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Person getClichedMessage(){
		Person person = new Person();
		person.setId(1);
		person.setName("hu jia");
		return person;
	}
}
