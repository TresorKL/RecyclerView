package com.example.recyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    String[] languages;
    String[] descriptions;
    int[] images;
    public MyAdapter(Context context, String[] languages, String[] description,int[] images ){

        this.context =context;
        this.languages=languages;
        this.descriptions =description;
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
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.language.setText(languages[position]);
        holder.description.setText(descriptions[position]);
        holder.image.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return descriptions.length;
    }

    // ACCESS THE ROW LAYOUT Views (images, texts,...)
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView language, description;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

             language = itemView.findViewById(R.id.language);
             description = itemView.findViewById(R.id.description);
             image =itemView.findViewById(R.id.image);
        }
    }
}
