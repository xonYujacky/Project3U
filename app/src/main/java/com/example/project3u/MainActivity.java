package com.example.project3u;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //called object and create from class of java
        //Project gettingStartedProject = new Project("Getting Starter App","Our very first project, the default 'Hello World' App !", 5);

        //Array
        Project[] projects ={
                new Project("Getting Starter App","Our very first project, the default 'Hello World' App !", R.drawable.getting_started),
                new Project("Dev Quote","Second project, the simple quote", R.drawable.quote),
                new Project("BMI Calculator","A Real Life working BMI calculator", R.drawable.calculator),
                new Project("Iches Converter","A basic Inches calculator !", R.drawable.tape),
                new Project("The Hungry Dev","List View menu of restaurant", R.drawable.hungry_developer)


        };




    }
}
