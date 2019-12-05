package <%= package %>.resource;

import javax.ws.rs.*;

@Path("test-service")
public interface TestService {

    @GET
    @Path("/ping")
    @Consumes("application/json")
    @Produces("application/json")
    String ping(@QueryParam("pong") String pong);

}
