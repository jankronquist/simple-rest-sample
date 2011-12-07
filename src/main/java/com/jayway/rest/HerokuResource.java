package com.jayway.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HerokuResource {
	@GET
	@Path("/get")
	public Response get(@QueryParam("param") String msg) {
		return Response.ok("param was: " + msg).build();
	}

	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	public Response person(@QueryParam("first") String first, @QueryParam("last") String last) {
		return Response.ok(new PersonDTO(first, last)).build();
	}
}
