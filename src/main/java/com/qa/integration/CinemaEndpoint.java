package com.qa.integration;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.ICinemaService;

@Path("test")
public class CinemaEndpoint {
	@Inject
	private ICinemaService service;

	@GET
	@Produces("application/json")
	public String sayHello() {
		return service.sayHello();
	}
}
