package com.ungear.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

@Service
@Path("/")
public class HelloWorld {

	@GET
	@Path("text")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "This is not the text your are looking for. *wave*";
	}

}