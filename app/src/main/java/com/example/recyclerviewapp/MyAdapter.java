package com.example.recyclerviewapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    String[] languages;
    String[] descriptions;

    int[] images;
    public MyAdapter(Context context, String[] languages, String[] descriptions,int[] images ){

        this.context =context;
        this.languages=languages;
        this.descriptions =descriptions;
        this.images=images;
    }

    @NonNull
    @Override
    // GET THE ROW LAYOUT
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.language.setText(languages[position]);
        holder.description.setText(descriptions[position]);
        holder.image.setImageResource(images[position]);
        holder.myRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondPage = new Intent(context, SecondActivity.class);

                // sending corresponding data to the second activity
                secondPage.putExtra("language",languages[position]);
                secondPage.putExtra("description",descriptions[position]);
                secondPage.putExtra("image",images[position]);
                context.startActivity(secondPage);

            }
        });

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    // ACCESS DATA LAYOUT Views (images, texts,relative Layout...)
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView language, description;
        ImageView image;
        RelativeLayout myRow;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

             language = itemView.findViewById(R.id.language);
             description = itemView.findViewById(R.id.description);
             image =itemView.findViewById(R.id.image);
            myRow =  itemView.findViewById(R.id.myRow);
        }
    }
}
