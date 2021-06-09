package com.israa.shppingapp.model;

import com.israa.shppingapp.R;

import java.util.ArrayList;

public class ProductCollection {

    public static ArrayList<Product> getSpaceships()
    {
        ArrayList<Product> products=new ArrayList<>();

        Product product=new Product();
        product.setName("Primeblue");
        product.setRating(4);
        product.setPrice("12€");
        product.setDescription("Curiosity drives creativity. This version of the adidas NMD_R1 is made for city explorers and is an innovative variant of the running shoes from the 80s.");
        product.setImageUrls(R.drawable.primeblue_boot);
        products.add(product);

        product=new Product();
        product.setName("JERSEY");
        product.setRating(4);
        product.setPrice("20€");
        product.setDescription("They win on the pitch, but Plaza de Cibeles is the place where they celebrate with their football family. The design of this authentic Real Madrid shirt from adidas is inspired by the concentric circles and spiral pattern on the fountain in Madrid's famous squares. Made for players, with light details and cooling HEAT.RDY.");
        product.setImageUrls(R.drawable.realmadrid_m);
        products.add(product);

        product=new Product();
        product.setName("JERSEY");
        product.setRating(5);
        product.setPrice("20€");
        product.setDescription("They win on the pitch. But Plaza de Cibeles is the place where they celebrate with their football family. The design of this Real Madrid shirt from adidas is inspired by the concentric circles around the fountain in the famous square in Madrid. This fan shirt is made of soft material with moisture-absorbing AEROREADY.");
        product.setImageUrls(R.drawable.realmadrid_w);
        products.add(product);


        product=new Product();
        product.setName("SHORTS");
        product.setRating(5);
        product.setPrice("12€");
        product.setDescription("Reppa Real Madrid. These football shorts from adidas are made in the club's home colors. Wear them both on the pitch and in remote locations. Moisture-absorbing AEROREADY keeps you comfortable wherever the game takes you.");
        product.setImageUrls(R.drawable.shorts);
        products.add(product);


        product=new Product();
        product.setName("Goalkeeper Jersey");
        product.setRating(5);
        product.setPrice("20€");
        product.setDescription("The impressive play at the Bernabéu often results in the team managing to keep a clean sheet. This Real Madrid youth football shirt is created with Primeblue made with Parley Ocean Plastic and gives you the flexibility and focus you need to keep the position in the goal. AEROREADY keeps you dry and the light material is designed for movement, with side slits and extra stretch under the arms.");
        product.setImageUrls(R.drawable.goalkeeper_jersey);
        products.add(product);

        return products;
    }

}
