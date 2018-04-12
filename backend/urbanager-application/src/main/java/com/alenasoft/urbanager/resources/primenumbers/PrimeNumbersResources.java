package com.alenasoft.urbanager.resources.primenumbers;

import com.alenasoft.urbanager.resources.primenumbers.service.PrimeNumbersService;
import com.google.inject.Inject;
import io.dropwizard.hibernate.UnitOfWork;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * Based on:
 * This is a simple Example resource.
 *
 * @author Luis Roberto Perez
 * @since 20-05-17
 */


@Path("PrimeNumbers")
//@Api(value = ExampleResource.NAME, description = "Simple example resource")
public class PrimeNumbersResources {

    @Inject
    private PrimeNumbersService service;

    @GET
    @UnitOfWork
    @Path("isPrime/{num1}")
    public Boolean isPrime(@PathParam("num1") int num1){
        return this.service.IsPrime(num1);
    }

    @GET
    @UnitOfWork
    @Path("/firstNPrime")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> firstPrimeNumbers(@QueryParam("num1") int num1){
        return this.service.firstNPrimeNumbers(num1);
    }



}
