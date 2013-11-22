
package fr.firat.examples.jaxrswebapp.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/")
public final class HelloWorldService {



    //~ --- [CONSTRUCTORS] ---------------------------------------------------------------------------------------------

    public HelloWorldService() {

    }



    //~ --- [METHODS] --------------------------------------------------------------------------------------------------

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {

        return "hello world";
    }
}
