package ua.lviv.iot.lab3;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws. rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/shoes")
public class ShoeService {

    public static Map<Integer, Shoe> shoes = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Shoe getShoe(@PathParam("id") Integer id) {
        return shoes.get(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createShoe(final Shoe shoe) {
        shoes.put(shoe.getId(), shoe);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteShoe(final @PathParam("id") Integer id) {
        shoes.remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateShoe(final Shoe shoe) {
        shoes.replace(shoe.getId(), shoe);
        return Response.status(200).entity(shoes.get(shoe.getId())).build();
    }
}