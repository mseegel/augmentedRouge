package com.mseegel.augmentedrouge;

import java.util.ArrayList;
import java.util.List;

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
    private ArrayList<Skill> skillList = new ArrayList<Skill>();

    public  Character() {

    }

    public Character(String name, int maxHP, int curHP){
        //test code TODO: clean this code
        this.name = name;
        this.maxHP = maxHP;
        this.curHP = curHP;
        CharacterClass characterClass = createCharacterClass();
        this.characterClass = characterClass;
        ArrayList<Skill> skills = new ArrayList<Skill>();
        skills = createSkills();
        this.skillList = skills;
        System.out.println(skills.size());
    }

    public CharacterClass createCharacterClass(){
        CharacterClass cClass = new CharacterClass("mage");
        return cClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurHP() {
        return curHP;
    }

    public void setCurHP(int curHP) {
        this.curHP = curHP;
    }

    public CharacterClass getCharacterClass(){
        return characterClass;
    }

    private ArrayList<Skill> createSkills() {
        ArrayList<Skill> skills = new ArrayList<Skill>();
        skills.add(new Skill("Heavy Blow"));
        return skills;
    }

    public ArrayList<Skill> getSkills() {
        return this.skillList;
    }

}
