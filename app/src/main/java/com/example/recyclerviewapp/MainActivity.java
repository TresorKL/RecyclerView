package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] languages={};
    String[] descriptions={};
    // access string arrays from string.xml
    int[] images={R.drawable.java,R.drawable.javascript, R.drawable.python,R.drawable.c,R.drawable.react};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languages = getResources().getStringArray(R.array.languages);
        descriptions = getResources().getStringArray(R.array.description);

        // find recyclerView by id
        recyclerView = findViewById(R.id.myRecycler);

        // instantiate adapter class
        MyAdapter myAdapter = new MyAdapter(this,languages,descriptions,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}