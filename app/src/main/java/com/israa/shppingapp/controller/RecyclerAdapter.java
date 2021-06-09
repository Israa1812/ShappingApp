package com.israa.shppingapp.controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iarcuschin.simpleratingbar.SimpleRatingBar;
import com.israa.shppingapp.R;
import com.israa.shppingapp.model.Product;
import com.israa.shppingapp.view.ProductActivity;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder> {

    private ArrayList<Product> products;
    private Context c;


    public RecyclerAdapter(ArrayList<Product> products, Context c) {
        this.products = products;
        this.c = c;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.product_list,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        Product product=products.get(position);
        holder.name.setText(product.getName());
        holder.imageView.setImageResource(product.getImageUrls());
        holder.ratingBar.setRating(product.getRating());
        holder.price.setText(product.getPrice() +" €");
        holder.ratingBar.setRating(product.getRating());
        holder.dec.setText(product.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c, ProductActivity.class);
                intent.putExtra("name", products.get(position).getName());
                intent.putExtra("price", products.get(position).getPrice());
                intent.putExtra("image", products.get(position).getImageUrls());
                intent.putExtra("dec", products.get(position).getDescription());

                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    /*
    VIEW HOLDER CLASS
     */
    class MyHolder extends RecyclerView.ViewHolder
    {

        SimpleRatingBar ratingBar;

        TextView name, price, dec;
        ImageView imageView;

        public MyHolder(View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.nameId);
            dec = itemView.findViewById(R.id.desid);
            price = itemView.findViewById(R.id.priceId);
            imageView = itemView.findViewById(R.id.imageProductId);
            ratingBar= (SimpleRatingBar) itemView.findViewById(R.id.ratingBarID);

        }
    }
}