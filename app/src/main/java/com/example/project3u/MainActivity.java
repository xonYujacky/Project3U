package com.example.project3u;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //called object and create from class of java
        //Project gettingStartedProject = new Project("Getting Starter App","Our very first project, the default 'Hello World' App !", 5);

        //Recycler view
        RecyclerView list_object = findViewById(R.id.recycler_list_view_object);


        //Array
        Project[] projects = {
                new Project("Getting Starter App", "Our very first project, the default 'Hello World' App !", R.drawable.getting_started),
                new Project("Dev Quote", "Second project, the simple quote", R.drawable.quote),
                new Project("BMI Calculator", "A Real Life working BMI calculator", R.drawable.calculator),
                new Project("Iches Converter", "A basic Inches calculator !", R.drawable.tape),
                new Project("The Hungry Dev", "List View menu of restaurant", R.drawable.hungry_developer)
        };




    }
}


//Ini cara pake listView
//        ListView listView = findViewById(R.id.recyle_list_view);
//
//        String [] strings = {"One", "Two" , "Three"};
//
//        ArrayAdapter<String> adapter  = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,strings);
//
//        listView.setAdapter(adapter);
