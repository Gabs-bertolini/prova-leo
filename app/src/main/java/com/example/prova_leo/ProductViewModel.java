package com.example.prova_leo;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProductViewModel extends AndroidViewModel {

    private ProductDao productDao;
    private LiveData<List<Product>> allProducts;
    private ExecutorService executorService;

    public ProductViewModel(@NonNull Application application) {
        super(application);
        ProductDatabase database = ProductDatabase.getDatabase(application);
        productDao = database.productDao();
        allProducts = productDao.getAllProducts();
        executorService = Executors.newSingleThreadExecutor();
    }

    public LiveData<List<Product>> getAllProducts() {
        return allProducts;
    }

    public void insert(Product product) {
        executorService.execute(() -> productDao.insert(product));
    }
}