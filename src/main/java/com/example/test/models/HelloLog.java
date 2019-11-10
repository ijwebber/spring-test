package com.example.test.models;

import java.util.Date;

public class HelloLog {

    private String name;
    private Date timestamp;

    public HelloLog(String name) {
        this.name = name;
        timestamp = new Date();
    }

    //no argument-constructor
    public HelloLog(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
