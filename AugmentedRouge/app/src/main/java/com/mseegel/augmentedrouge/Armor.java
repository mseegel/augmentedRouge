package com.mseegel.augmentedrouge;

/**
 * Created by Matthew on 9/5/2016.
 */
public class Armor extends Item{

    private int slot;
    private int def;
    private int skill;
    private String name;

    public Armor(){

    }

    public Armor(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
