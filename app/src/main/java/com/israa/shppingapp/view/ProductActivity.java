package com.israa.shppingapp.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.israa.shppingapp.R;

public class ProductActivity extends AppCompatActivity {

    private String name, description;
    private int image;
    private float price;
    private TextView mName, mPrice, mDescription;
    private ImageView mImage;
    private Button add;

    SharedPreferences sharedPreferences;
    private static final String SHARE="MYpref";
    private static final String keyname = "name";
    private static final String keyprice = "price";
    private static final String keyImage="image";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Intent intent = getIntent();
        sharedPreferences = getSharedPreferences(SHARE,MODE_PRIVATE);
        name = intent.getStringExtra("name");
        price = intent.getFloatExtra("price",0);
        description = intent.getStringExtra("dec");
        image = intent.getIntExtra("image",R.drawable.realmadrid_w);



        mName = findViewById(R.id.nameid);
        mPrice = findViewById(R.id.priceid);
        mImage = findViewById(R.id.imageView3);
        mDescription = findViewById(R.id.desid);
        add = findViewById(R.id.button);

        mName.setText(name);
        mPrice.setText(price +" €");
        mImage.setImageResource(image);
        mDescription.setText(description);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(keyname,name);
                editor.putFloat(keyprice,price);
                editor.putInt(keyImage,image);
                editor.apply();

                Intent i = new Intent(ProductActivity.this, BasketActivity.class);
                startActivity(i);
            }
        });

    }

}