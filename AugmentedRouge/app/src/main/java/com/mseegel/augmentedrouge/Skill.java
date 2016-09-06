package com.mseegel.augmentedrouge;

/**
 * Created by Matthew on 9/5/2016.
 */
public class Skill {

    private int id;
    private String name;
    private String description;

    public Skill() {

    }

    public Skill(String name){
        //this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
