/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

/**
 *
 * @author Thiết Béo
 */
public class Stocks {
    private int id;
    private int quantity;
    private int current_quantity;
    private String product_id;
    private int buy_quantity;

    public Stocks(int id, int quantity, int current_quantity, String product_id, int buy_quantity) {
        this.id = id;
        this.quantity = quantity;
        this.current_quantity = current_quantity;
        this.product_id = product_id;
        this.buy_quantity = buy_quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCurrent_quantity() {
        return current_quantity;
    }

    public void setCurrent_quantity(int current_quantity) {
        this.current_quantity = current_quantity;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getBuy_quantity() {
        return buy_quantity;
    }

    public void setBuy_quantity(int buy_quantity) {
        this.buy_quantity = buy_quantity;
    }
    
}
