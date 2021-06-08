package com.israa.shppingapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.israa.shppingapp.R;

public class ProductActivity extends AppCompatActivity {

    private String name, price, description;
    private int image;
    private TextView mName, mPrice, mDescription;
    private ImageView mImage;
    private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        price = intent.getStringExtra("price");
        description = intent.getStringExtra("dec");
        image = intent.getIntExtra("image",R.drawable.realmadrid_w);



        mName = findViewById(R.id.nameid);
        mPrice = findViewById(R.id.priceid);
        mImage = findViewById(R.id.imageView3);
        mDescription = findViewById(R.id.desid);
        add = findViewById(R.id.button);

        mName.setText(name);
        mPrice.setText(price);
        mImage.setImageResource(image);
        mDescription.setText(description);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProductActivity.this, BasketActivity.class);
                intent.putExtra("names", mName.getText());
                intent.putExtra("prices", mPrice.getText());
                // intent.putExtra("image", mImage.);
                startActivity(i);
            }
        });




    }



}
