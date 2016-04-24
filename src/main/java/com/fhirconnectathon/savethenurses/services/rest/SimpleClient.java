package com.fhirconnectathon.savethenurses.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.fhirconnectathon.savethenurses.json.condition.Condition;

public interface SimpleClient
{
   @GET
   @Path("basic")
   @Produces("application/json")
   Condition getBasic();
   
   @GET
   @Path("queryParam")
   @Produces("text/plain")
   String getQueryParam(@QueryParam("param")String param);

   @GET
   @Path("matrixParam")
   @Produces("text/plain")
   String getMatrixParam(@MatrixParam("param")String param);

   @GET
   @Path("uriParam/{param}")
   @Produces("text/plain")
   int getUriParam(@PathParam("param")int param);
}