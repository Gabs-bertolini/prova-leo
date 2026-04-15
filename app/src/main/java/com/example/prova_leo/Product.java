package com.example.prova_leo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "products")
public class Product {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;
    public String code;
    public double price;
    public int quantity;

    public Product(String name, String code, double price, int quantity) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCode() { return code; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCode(String code) { this.code = code; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}