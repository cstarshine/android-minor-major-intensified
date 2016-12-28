package com.jin.asdf;

/**
 * Created by Jin on 2016-12-21.
 */

public class student {
    boolean isLeft;
    String name;
    long id;

    public student(boolean isLeft, String name, long id) {
        this.isLeft = isLeft;
        this.name = name;
        this.id = id;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public void setLeft(boolean left) {
        isLeft = left;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
