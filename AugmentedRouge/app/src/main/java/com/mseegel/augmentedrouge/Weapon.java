package com.mseegel.augmentedrouge;

/**
 * Created by Matthew on 9/5/2016.
 */
public class Weapon extends Item {

    private int damage;
    private int skill;
    private String name;

    public Weapon() {}

    public Weapon(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

