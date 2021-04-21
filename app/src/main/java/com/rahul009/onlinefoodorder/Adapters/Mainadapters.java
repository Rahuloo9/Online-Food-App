package com.rahul009.onlinefoodorder.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rahul009.onlinefoodorder.Models.MianModels;
import com.rahul009.onlinefoodorder.R;

import java.util.ArrayList;

public class Mainadapters extends RecyclerView.Adapter<Mainadapters.viewholder>{

    ArrayList<MianModels> list;
    Context context;

    public Mainadapters(ArrayList<MianModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_list,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {


final  MianModels models=list.get(position);
        holder.foodimage.setImageResource(models.getImage());
        holder.mainname.setText(models.getName());
        holder.price.setText(models.getPrice());
        holder.description.setText(models.getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public  class viewholder extends RecyclerView.ViewHolder {
        ImageView foodimage;
        TextView mainname,price,description;
        public viewholder(@NonNull View itemView) {
            super(itemView);

    foodimage=itemView.findViewById(R.id.imageView);
    mainname=itemView.findViewById(R.id.name);
    price=itemView.findViewById(R.id.priceorder);
    description=itemView.findViewById(R.id.description);

        }
    }
}
