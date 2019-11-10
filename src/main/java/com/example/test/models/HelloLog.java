package com.example.test.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "helloLog")
public class HelloLog {

    private String name;
    private Date timestamp;
    private int uid;

    public HelloLog(String name) {
        this.name = name;
        timestamp = new Date();

    }

    //no argument-constructor
    public HelloLog(){}

    @Id //primary key
    @GeneratedValue //Will create a value for it
    @NotNull
    @Column(name = "uid", unique = true)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Column(name = "timestamp")
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
