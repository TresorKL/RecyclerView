package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView language,description;
    ImageView image;

    String title, descri;
    int img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        language = findViewById(R.id.title);
        description = findViewById(R.id.descri);
        image =findViewById(R.id.mainImage);

        getData();
        setData();

    }

    // get data from Exctra
    private void getData(){
           if(getIntent().hasExtra("language")&&getIntent().hasExtra("description")&&getIntent().hasExtra("image")){

               title = getIntent().getStringExtra("language");
               descri =getIntent().getStringExtra("description");
               img = getIntent().getIntExtra("image",1);

           }else{
               Toast.makeText(this,"MO DATA FOUND",Toast.LENGTH_LONG).show();
           }

    }


    private void setData(){

        language.setText(title);
        description.setText(descri);
        image.setImageResource(img);

    }
}