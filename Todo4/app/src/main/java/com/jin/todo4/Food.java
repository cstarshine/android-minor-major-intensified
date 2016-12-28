package com.jin.todo4;

import io.realm.RealmObject;
import io.realm.annotations.Index;

/**
 * Created by Jin on 2016-12-26.
 */

public class Food extends RealmObject{

    private String name;
    private String price;
    private String image;

    public Food(){
    }

    public Food(String image, String price, String name) {
        this.image = image;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

}
