package com.example.wajhat.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.wajhat.Adapters.BecomeRecentAdapter;
import com.example.wajhat.Adapters.MostPopularAdapter;
import com.example.wajhat.Adapters.ProductsAdapter;
import com.example.wajhat.Models.BecomeRecentModel;
import com.example.wajhat.Models.MostPopularModel;
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

        // Become Recent View
        RecyclerView recyclerViewBecomeRecent = findViewById(R.id.recycler_view_of_become_recent);
        BecomeRecentModel[] becomeRecentList = BecomeRecentModel.products;
        BecomeRecentAdapter becomeRecentAdapter = new BecomeRecentAdapter(becomeRecentList);
        recyclerViewBecomeRecent.setHasFixedSize(true);
        recyclerViewBecomeRecent.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL, false));
        recyclerViewBecomeRecent.setAdapter(becomeRecentAdapter);
        recyclerViewBecomeRecent.addItemDecoration(itemSpacer);

        // Most Popular View
        RecyclerView recyclerViewMostPopular = findViewById(R.id.recycler_view_of_most_popular);
        MostPopularModel[] mostPopularList = MostPopularModel.products;
        MostPopularAdapter mostPopularAdapter = new MostPopularAdapter(mostPopularList);
        recyclerViewMostPopular.setHasFixedSize(true);
        recyclerViewMostPopular.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
        recyclerViewMostPopular.setAdapter(mostPopularAdapter);
        recyclerViewMostPopular.addItemDecoration(itemSpacer);


    }
}