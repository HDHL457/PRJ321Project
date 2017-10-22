/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

/**
 *
 * @author tanlu
 */
public class CartItem {
    private int quantity, id;
    private String name, imagePath;
    private double price;

    public CartItem() {
    }

    public CartItem(String imagePath, int quantity, String name, double price, int id) {
        this.imagePath = imagePath;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
