package com.rahul009.onlinefoodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rahul009.onlinefoodorder.Adapters.Mainadapters;
import com.rahul009.onlinefoodorder.Models.MianModels;
import com.rahul009.onlinefoodorder.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


  ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MianModels> list=new ArrayList<>();
        list.add(new MianModels(R.drawable.pizzu,"Pizza","5","Pizza with extra cheese"));
        list.add(new MianModels(R.drawable.birrryani,"Biryaani","10","half"));
        list.add(new MianModels(R.drawable.buger,"Bugger","15","Bugger with extra cheese"));
        list.add(new MianModels(R.drawable.chikan,"Chikan","35","leg pis with Chattani"));
        list.add(new MianModels(R.drawable.dosa,"Dosa","10","large"));
        list.add(new MianModels(R.drawable.fish,"Fish","40","medium")) ;

        Mainadapters mainadapters= new Mainadapters(list,this);
        binding.recyleview.setAdapter(mainadapters);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        binding.recyleview.setLayoutManager(linearLayoutManager);

    }
}