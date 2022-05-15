package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] languages={};
    String[] descriptions={};
    int[] images={R.drawable.java,R.drawable.javascript, R.drawable.python,R.drawable.c,R.drawable.react};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        languages = getResources().getStringArray(R.array.languages);
        descriptions = getResources().getStringArray(R.array.description);

        recyclerView = findViewById(R.id.myRecycler);
    }
}