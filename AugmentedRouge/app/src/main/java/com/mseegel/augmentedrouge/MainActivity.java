package com.mseegel.augmentedrouge;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //test code TODO: remove this code
        Character character = CreateCharacter();
        Debugger db = new Debugger();
        db.print(character.getName());
        db.print(character.getCharacterClass().getName());
        db.print(character.getSkills().get(0).getName());
        db.print(character.getArmorList().get(0).getName());
        db.print(character.getWeapon().getName());
    }

    public Character CreateCharacter() {
        Character character = new Character("Matthew", 100, 50);
        System.out.println("hello");
        return character;
    }

}
