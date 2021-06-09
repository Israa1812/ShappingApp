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
    private TextView mName, mPrice;
    private ImageView imageView;

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
        mPrice = findViewById(R.id.priceid);
        imageView = findViewById(R.id.imageProductId);


        sharedPreferences = getSharedPreferences(SHARE, Context.MODE_PRIVATE);

        String name = sharedPreferences.getString(keyname,null);
        String price = sharedPreferences.getString(keyprice,null);
        int image = sharedPreferences.getInt(keyImage,0);
        mName.setText(name);
        mPrice.setText(price);
        imageView.setImageResource(image);


        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor= sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();
                Intent intent = new Intent(BasketActivity.this, CheckOutActivity.class);
                startActivity(intent);

            }
        });

    }
}