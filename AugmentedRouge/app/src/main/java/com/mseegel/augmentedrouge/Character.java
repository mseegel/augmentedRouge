package com.mseegel.augmentedrouge;

/**
 * Created by Matthew on 9/5/2016.
 */
public class Character {

    //character stats
    private String name;
    private int maxHP;
    private int curHP;
    private int attk;
    private int def;
    private int speed;
    private CharacterClass characterClass;

    public void Character() {

    }

    public CharacterClass getCharacterClass(){
        CharacterClass cClass = new CharacterClass();
        return cClass;
    }
}
