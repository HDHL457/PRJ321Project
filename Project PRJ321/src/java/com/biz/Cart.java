/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tanlu
 */
public class Cart {

    //list of items
    private List<CartItem> cartItems;

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public void addCartItem(CartItem ci) {
        //check if have id in list -> increase 1
        for (CartItem cardItem : cartItems) {
            if (cardItem.getId() == ci.getId()) {
                cardItem.setQuantity(cardItem.getQuantity() + 1);
                return;
            }
        }
        //else add new
        cartItems.add(ci);
    }

    public void removeCartItem(int id) {
        cartItems.removeIf((CartItem t) -> t.getId() == id);
    }

    public void updateQuantity(int id, int quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getId() == id) {
                cartItem.setQuantity(quantity);
                break;
            }
        }
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public double getAmount() {
        double amount = 0;
        for (CartItem cardItem : cartItems) {
            amount += cardItem.getPrice() * cardItem.getQuantity();
        }
        return amount;
    }
}
