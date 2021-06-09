package com.israa.shppingapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.israa.shppingapp.R;
import com.israa.shppingapp.controller.RecyclerAdapter;
import com.israa.shppingapp.model.Product;
import com.israa.shppingapp.model.ProductCollection;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView  productRecyclerView;
    private ImageView basket;

    Product product;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productRecyclerView = findViewById(R.id.productRecyclerViewId);
        basket = findViewById(R.id.imageView2);



        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        productRecyclerView.setLayoutManager(layoutManager);
        //adapter = new RecyclerAdapter(products, this);
        productRecyclerView.setAdapter(new RecyclerAdapter(ProductCollection.getSpaceships(),this));


        product = new Product();

        basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this, BasketActivity.class);
                startActivity(i);
            }
        });


    }

}