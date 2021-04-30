package com.hkr;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class helloWorld {
//        @GET
//        @Produces(MediaType.TEXT_XML)
//        public String getMessage(){
//            String resource = "<?xml version ='1.0' ?>"+"<hello> I am XML </hello>";
//            return resource;
//        }
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getMessageJSON(){
//       String resource = "Hello From JSON";
//        return resource;
//    }
//    @GET
//    @Produces(MediaType.TEXT_HTML)
//    public String getMessageHTML(){
//        String resource = "<h1> Hello From HTML </h1>";
//        return resource;
//    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getMessageHTML(@QueryParam("name") String name, @QueryParam("card_no") String card_no, @QueryParam("amount") int amount){
        System.out.println("Name is"+name);
        System.out.println("Amount is"+amount);

        String response;
        if (amount > 100000)
        {
            System.out.println("Amount is grater than 1 lakh");
            response = "Card Approved!!";
        }
        else
            {
                System.out.println("Amount less than 1 lakh");
                response = "Card not Approved!!";
            }

        return "<html>"+"<tittle>"+"Credit Card Authorization" +name+"<html>"+"<body><h1>"+response+"<h/1></body>"+"</html>";
    }

}
