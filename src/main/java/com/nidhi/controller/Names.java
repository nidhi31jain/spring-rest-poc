package com.nidhi.controller;
public class Names {

private String name;
private String desc;
private String id;


    public Names(String name, String desc, String id) {
        this.name = name;
        this.desc = desc;
        this.id = id;
    }

    public Names(){

    }


    public Names(Names names){

        this.name = names.name;
        this.desc = names.desc;
        this.id = names.id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

