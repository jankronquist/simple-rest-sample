package com.jayway.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HerokuResource {
	@GET
	@Path("/get")
	public Response get(@QueryParam("param") String msg) {
		String output = "Jersey say : " + msg;
		return Response.ok(output).build();
	}

}