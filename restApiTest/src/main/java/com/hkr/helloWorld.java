package com.hkr;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.MediaType;

@Path("/helloWorld")
public class helloWorld {
        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String getMessage(){
            String resource = "Hello WOrld";
            return resource;
        }
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getMessageJSON(){
//        String resource = "Hello From JSON";
//        return resource;
//    }
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getMessageHTML(){
//        String resource = "<h1> Hello From HTML </h1>";
//        return resource;
//    }
}
