package com.israa.shppingapp.view;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.israa.shppingapp.R;


public class BasketActivity extends AppCompatActivity {

    private Button checkout;
    private TextView mName, mPrice, mTotal;
    private ImageView imageView;
    private float tax, val;

    SharedPreferences sharedPreferences;
    private static final String SHARE="MYpref";
    private static final String keyname = "name";
    private static final String keyprice = "price";
    private static final String keyImage="image";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);



        checkout = findViewById(R.id.delete_all);
        mName = findViewById(R.id.namepro);
        mPrice = findViewById(R.id.price);
        imageView = findViewById(R.id.imageProductId);
        mTotal = findViewById(R.id.total);


        sharedPreferences = getSharedPreferences(SHARE, Context.MODE_PRIVATE);

        String name = sharedPreferences.getString(keyname,null);
        float price = sharedPreferences.getFloat(keyprice,0);
        int image = sharedPreferences.getInt(keyImage,0);


        //calc tax
        val = (float) (price * (0.17));
        tax = val + price;


        mName.setText(name);
        mPrice.setText(price +" €");
        imageView.setImageResource(image);
        mTotal.setText(tax + " €");

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
                Intent intent = new Intent(BasketActivity.this, ProfileActivity.class);
                startActivity(intent);

            }
        });


    }
}