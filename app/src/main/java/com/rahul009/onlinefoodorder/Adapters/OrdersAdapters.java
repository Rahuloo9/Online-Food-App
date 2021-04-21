package com.rahul009.onlinefoodorder.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.rahul009.onlinefoodorder.Models.OrderModels;
import com.rahul009.onlinefoodorder.R;
import java.util.ArrayList;

public class OrdersAdapters extends RecyclerView.Adapter<OrdersAdapters.viewholder> {
    ArrayList<OrderModels> list;
    Context context;

    public OrdersAdapters(ArrayList<OrderModels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.order_sample,parent,false);
        return new viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final OrderModels orderModels= list.get(position);
        holder.ordersImage.setImageResource(orderModels.getOrderImage());
        holder.orderName.setText(orderModels.getSelectOrdername());
        holder.orderNumber.setText(orderModels.getOrderNumber());
        holder.prices.setText(orderModels.getPrices());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
    ImageView ordersImage;
    TextView orderName,prices,orderNumber;
    public viewholder(@NonNull View itemView) {
        super(itemView);
      ordersImage =itemView.findViewById(R.id.orderimage);
      orderName=itemView.findViewById(R.id.ordername);
      prices=itemView.findViewById(R.id.orderprize);
      orderNumber=itemView.findViewById(R.id.ordernumber);

    }
}
}
