package ua.lviv.iot.lab3;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.ws. rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/shoes")
public class ShoeService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private ShoeDao shoeDao;

    public static Map<Integer, Shoe> shoes = new HashMap<>();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Shoe getShoe(@PathParam("id") Integer id) {
        return shoeDao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createShoe(final Shoe shoe) {
        shoeDao.persist(shoe);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteShoe(final @PathParam("id") Integer id) {
        shoeDao.delete(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateShoe(final Shoe shoe) {
        shoeDao.update(shoe);
        return Response.status(200).entity(shoes.get(shoe.getId())).build();
    }
}