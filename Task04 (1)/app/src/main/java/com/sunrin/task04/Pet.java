package com.sunrin.task04;

import io.realm.RealmObject;
import io.realm.annotations.Index;

/**
 * Created by Sunrin on 2016-12-23.
 */
public class Pet extends RealmObject {

    @Index
    private long id;

    private String type;
    private String name;
    private int age;

    public Pet() {

    }

    public Pet(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
