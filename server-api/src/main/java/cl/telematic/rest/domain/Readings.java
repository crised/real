package cl.telematic.rest.domain;

import java.util.Date;

/**
 * Created by crised on 5/29/14.
 */
// Esto es lo que se va a mandar al servidor.
public class Readings {

    private String deviceName;
    private Long voltFN1;
    private Long voltFN2;
    private Long voltFN3;
    private Date timeStamp;

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

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
