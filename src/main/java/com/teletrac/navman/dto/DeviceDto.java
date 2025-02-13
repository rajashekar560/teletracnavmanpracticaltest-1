package com.teletrac.navman.dto;

import java.util.Date;

public class DeviceDto {
    private String recordType;
    private int deviceId;
    private Date eventDateTime;

    private int fieldA;
    /*@NotEmpty
    @Size(min = 2, message = "FieldB should have at least 2 characters")*/
    private String fieldB;
    private double fieldC;

    public DeviceDto(String recordType, int deviceId, Date eventDateTime, int fieldA, String fieldB, double fieldC) {
        this.recordType = recordType;
        this.deviceId = deviceId;
        this.eventDateTime = eventDateTime;
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public Date getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(Date eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public int getFieldA() {
        return fieldA;
    }

    public void setFieldA(int fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public double getFieldC() {
        return fieldC;
    }

    public void setFieldC(double fieldC) {
        this.fieldC = fieldC;
    }
}
