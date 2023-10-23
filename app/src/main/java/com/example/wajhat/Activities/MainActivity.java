package com.example.wajhat.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.wajhat.Adapters.ProductsAdapter;
import com.example.wajhat.Models.ProductsModel;
import com.example.wajhat.R;
import com.example.wajhat.Utils.ProductsSpacer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Products view
        RecyclerView recyclerViewProducts = findViewById(R.id.recycler_view_of_products);
        ProductsModel[] productsList = ProductsModel.products;
        ProductsAdapter productsAdapter = new ProductsAdapter(productsList);
        recyclerViewProducts.setHasFixedSize(true);
        recyclerViewProducts.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL , false));
        recyclerViewProducts.setAdapter(productsAdapter);
        ProductsSpacer itemSpacer = new ProductsSpacer(25);
        recyclerViewProducts.addItemDecoration(itemSpacer);


    }
}