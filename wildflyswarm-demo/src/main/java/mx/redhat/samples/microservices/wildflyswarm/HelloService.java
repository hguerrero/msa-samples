package mx.redhat.samples.microservices.wildflyswarm;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("hello")
public class HelloService 
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response hello() 
	{
		return Response.ok("Hello World!").build();
	}
}
