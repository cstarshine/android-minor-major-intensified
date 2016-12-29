package com.jin.project;

import io.realm.RealmObject;

/**
 * Created by Jin on 2016-12-28.
 */

public class Sche extends RealmObject {
    String Sche;

    public String getSche() {
        return Sche;
    }

    public void setSche(String sche) {
        Sche = sche;
    }

    public Sche(){

    }

    public Sche(String sche) {

        Sche = sche;
    }
}
