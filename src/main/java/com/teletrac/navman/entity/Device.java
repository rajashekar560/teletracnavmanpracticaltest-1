package com.teletrac.navman.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name = "device")
public class Device {

    @Column(name = "recordType", nullable = false)
    private String recordType;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deviceId;

    private Date eventDateTime;

    private int fieldA;

    @NotEmpty
    @Size(min = 2, message = "FieldB should have at least 2 characters")
    private String fieldB;

    private double fieldC;

    public Device() {

    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
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

    public Device(String recordType, long deviceId, Date eventDateTime, int fieldA, String fieldB, double fieldC) {
        this.recordType = recordType;
        this.deviceId = deviceId;
        this.eventDateTime = eventDateTime;
        this.fieldA = fieldA;
        this.fieldB = fieldB;
        this.fieldC = fieldC;
    }
}
