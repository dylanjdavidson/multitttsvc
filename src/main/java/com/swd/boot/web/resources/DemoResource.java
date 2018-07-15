package com.swd.boot.web.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Consumes({ "application/json" })
@Produces({ "application/json" })
@Component
@Path("/")
public class DemoResource {

    @GET
    @Path("/hello")
    public String hello(){
        return "Hello --- from DEMO !!";
    }

}
