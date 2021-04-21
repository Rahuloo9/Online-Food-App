package com.rahul009.onlinefoodorder.Models;

import android.widget.ImageView;
import android.widget.TextView;

public class OrderModels {
int orderImage;
String selectOrdername,prices,orderNumber;

    public OrderModels(int orderImage, String selectOrdername, String prices, String orderNumber) {
        this.orderImage = orderImage;
        this.selectOrdername = selectOrdername;
        this.prices = prices;
        this.orderNumber = orderNumber;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }

    public String getSelectOrdername() {
        return selectOrdername;
    }

    public void setSelectOrdername(String selectOrdername) {
        this.selectOrdername = selectOrdername;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
