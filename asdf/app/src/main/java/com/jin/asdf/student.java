package com.jin.asdf;

/**
 * Created by Jin on 2016-12-21.
 */

public class student {
    String[] name;
    long id;

    public student(String[] name, long id) {
        this.name = name;
        this.id = id;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
