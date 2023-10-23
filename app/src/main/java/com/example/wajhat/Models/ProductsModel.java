package com.example.wajhat.Models;

import com.example.wajhat.R;

public class ProductsModel {
    private final String title_of_product;
    private final String new_price_of_product;
    private final String old_price_of_product;
    private final String discount_of_product;
    private final int image_of_product;

    public static final ProductsModel[] products = new ProductsModel[]{
            new ProductsModel("شمع معطر برائحة الفانيليا", "115.000 ل.س", "230.000 ل.س", "50%", R.drawable.candle_vanilla),
            new ProductsModel("صابون غار معطر", "93.750 ل.س", "125.000 ل.س", "25%", R.drawable.soap_img),
            new ProductsModel("ورد البنفسج", "40.000 ل.س", "50.000 ل.س", "20%", R.drawable.flowers_lavander),
            new ProductsModel("دمية الدب البني", "45.000 ل.س", "50.000 ل.س", "10%", R.drawable.teddy)
    };

    public ProductsModel(String titleOfProduct, String newPriceOfProduct, String oldPriceOfProduct, String discountOfProduct, int imageOfProduct) {
        title_of_product = titleOfProduct;
        new_price_of_product = newPriceOfProduct;
        old_price_of_product = oldPriceOfProduct;
        discount_of_product = discountOfProduct;
        image_of_product = imageOfProduct;
    }

    public String getTitle_of_product() {
        return title_of_product;
    }

    public String getNew_price_of_product() {
        return new_price_of_product;
    }

    public String getOld_price_of_product() {
        return old_price_of_product;
    }

    public String getDiscount_of_product() {
        return discount_of_product;
    }

    public int getImage_of_product() {
        return image_of_product;
    }
}
