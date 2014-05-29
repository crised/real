package cl.telematic.rest;

import cl.telematic.rest.domain.Readings;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.Date;

/**
 * Created by crised on 5/29/14.
 */
public class ReadingResourceImpl implements ReadingsResource {

    @GET
    @Path("/{device}")
    public Readings getDeviceStats(@NotNull @PathParam("device") String deviceName)
    {
        return getFakeReading();

    }

    @POST
    @Path("/{device}")
    public Response save(@NotNull @PathParam("device") String deviceName, @NotNull @Valid Readings readings){
        return null;

    }

    private Readings getFakeReading(){

        Readings readings = new Readings();
        readings.setTimeStamp(new Date());
        readings.setDeviceName("crised.noip.me");
        readings.setVoltFN1(new Long(220));
        readings.setVoltFN2(new Long(220));
        readings.setVoltFN3(new Long(120));
        return readings;

    }
}
