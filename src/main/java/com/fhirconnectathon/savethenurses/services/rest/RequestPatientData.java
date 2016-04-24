package com.fhirconnectathon.savethenurses.services.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.fhirconnectathon.savethenurses.json.patient.Patient;

public class RequestPatientData {

    @Consumes("application/json")
	public Patient getPatientCondition(){
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("https://open-ic.epic.com/FHIR/api/FHIR/DSTU2/Patient/Tbt3KuCY0B5PSrJvCu2j-PlK.aiHsu2xUjUM8bWpetXoB?_format=json");
        Response response = target.request().get();
        response.getHeaders().putSingle(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON);
        response.getHeaders().putSingle(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON);

        System.out.println(response.getHeaders().toString());
        
        System.out.println(response.getLength());
        System.out.println(response.getMediaType());
        
        //Read output in string format
        Patient value = response.readEntity(Patient.class);
        System.out.println(value);
        response.close();
        System.out.println(value.getGender().toString());
		return value;  
	}

}
