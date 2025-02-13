package com.teletrac.navman.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

@Entity
@Table(name="echo")
public class Echo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int echoId;

    @NotNull
    @Size(message = "EchoType Must not be empty.")
    private String echoType;

    private Date echoDateTime;

    public Echo() {
    }

    public Echo(int echoId, String echoType, Date echoDateTime) {
        this.echoId = echoId;
        this.echoType = echoType;
        this.echoDateTime = echoDateTime;
    }

    public int getEchoId() {
        return echoId;
    }

    public void setEchoId(int echoId) {
        this.echoId = echoId;
    }

    public String getEchoType() {
        return echoType;
    }

    public void setEchoType(String echoType) {
        this.echoType = echoType;
    }

    public Date getEchoDateTime() {
        return echoDateTime;
    }

    public void setEchoDateTime(Date echoDateTime) {
        this.echoDateTime = echoDateTime;
    }
}
