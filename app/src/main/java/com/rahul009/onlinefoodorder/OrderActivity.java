package com.rahul009.onlinefoodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.rahul009.onlinefoodorder.Adapters.Mainadapters;
import com.rahul009.onlinefoodorder.Adapters.OrdersAdapters;
import com.rahul009.onlinefoodorder.Models.OrderModels;
import com.rahul009.onlinefoodorder.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding orderBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        orderBinding= ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(orderBinding.getRoot());
        ArrayList<OrderModels> list =new ArrayList<>();
        list.add(new OrderModels(R.drawable.pizzu,"Pizzaa","5","123365465"));
        list.add(new OrderModels(R.drawable.pizzu,"Pizzaa","5","1233"));
        list.add(new OrderModels(R.drawable.pizzu,"Pizzaa","5","1233"));
        list.add(new OrderModels(R.drawable.pizzu,"Pizzaa","5","1233"));
        list.add(new OrderModels(R.drawable.pizzu,"Pizzaa","5","1233"));

      OrdersAdapters ordersAdapters= new OrdersAdapters(list,this);

        orderBinding.orderrecyle.setAdapter(ordersAdapters);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        orderBinding.orderrecyle.setLayoutManager(linearLayoutManager);





    }
}