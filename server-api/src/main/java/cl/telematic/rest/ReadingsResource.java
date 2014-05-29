package cl.telematic.rest;

import cl.telematic.rest.domain.Readings;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by crised on 5/29/14.
 */
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@Path("/device")
public interface ReadingsResource {

    @GET
    @Path("/{device}")
    Readings getDeviceStats(@NotNull @PathParam("device") String name);

    @POST
    @Path("/{device}")
    Response save(@NotNull @PathParam("device") Long deviceId, @NotNull @Valid Readings readings);
}