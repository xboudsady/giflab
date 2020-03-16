package com.teamtreehouse.giflib.model;

public class Category {

    private int id;                             // Private variables
    private String name;

    public Category(int id, String name) {      // Constructor to create our object, set as public
        this.id = id;
        this.name = name;
    }

    public int getId() {        // method to read
        return id;
    }

    public void setId() {       // method to assign
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

}
