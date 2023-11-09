package com.example.wajhat.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.wajhat.Adapters.ImageProductAdapter;
import com.example.wajhat.Models.ImageProductModel;
import com.example.wajhat.R;
import com.example.wajhat.Utils.ProductsSpacer;

public class ProductDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        // Images RecyclerView
        RecyclerView recyclerViewImageOfProducts = findViewById(R.id.recyclerView_of_images);
        ImageProductModel[] imageProductList = ImageProductModel.images;
        ImageProductAdapter imageProductAdapter = new ImageProductAdapter(this, imageProductList);
        recyclerViewImageOfProducts.setHasFixedSize(true);
        recyclerViewImageOfProducts.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
        recyclerViewImageOfProducts.setAdapter(imageProductAdapter);
        ProductsSpacer itemSpacer = new ProductsSpacer(15);
        recyclerViewImageOfProducts.addItemDecoration(itemSpacer);
    }
}