package com.example.prova_leo;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface ProductDao {
    @Insert
    void insert(Product product);

    @Query("SELECT * FROM products")
    LiveData<List<Product>> getAllProducts();
}