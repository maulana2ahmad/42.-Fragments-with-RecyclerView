package com.mractiveiddev.fragmentsrecyclerview;

/**
 * Created by vickydwikandia on 08/01/19.
 */

public class Person
{
    private String name;
    private String telpNr;

    public Person(String name, String telpNr) {
        this.name = name;
        this.telpNr = telpNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelpNr() {
        return telpNr;
    }

    public void setTelpNr(String telpNr) {
        this.telpNr = telpNr;
    }
}
