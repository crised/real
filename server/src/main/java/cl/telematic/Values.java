package cl.telematic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by crised on 5/29/14.
 */
@Entity
public class Values implements Serializable {

    @Id
    private Long id;

dmllo       private String deviceName;

    @NotNull
    private Long voltFN1;

    @NotNull
    private Long voltFN2;

    @NotNull
    private Long voltFN3;

    @NotNull
    private Date timeStampClient;

    @NotNull
    private Date timeStampServer;

    public Long getId() {
        return id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Long getVoltFN1() {
        return voltFN1;
    }

    public void setVoltFN1(Long voltFN1) {
        this.voltFN1 = voltFN1;
    }

    public Long getVoltFN2() {
        return voltFN2;
    }

    public void setVoltFN2(Long voltFN2) {
        this.voltFN2 = voltFN2;
    }

    public Long getVoltFN3() {
        return voltFN3;
    }

    public void setVoltFN3(Long voltFN3) {
        this.voltFN3 = voltFN3;
    }

    public Date getTimeStampClient() {
        return timeStampClient;
    }

    public void setTimeStampClient(Date timeStampClient) {
        this.timeStampClient = timeStampClient;
    }

    public Date getTimeStampServer() {
        return timeStampServer;
    }

    public void setTimeStampServer(Date timeStampServer) {
        this.timeStampServer = timeStampServer;
    }
}
