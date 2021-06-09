package com.israa.shppingapp.model;

public class Product {
    private String name;
    private String description;
    private String price;
    private Integer imageUrls;
    private int rating;


    public Product() {
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(Integer imageUrls) {
        this.imageUrls = imageUrls;
    }
}
