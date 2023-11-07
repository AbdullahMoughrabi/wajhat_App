package com.example.wajhat.Models;

import com.example.wajhat.R;

public class ImageProductModel {
    private final int image_of_product;

    public final static ImageProductModel[] images = new ImageProductModel[]{
      new ImageProductModel(R.drawable.candle_vanilla),
      new ImageProductModel(R.drawable.soap_img),
            new ImageProductModel(R.drawable.flowers_lavander),
            new ImageProductModel(R.drawable.teddy),
    };
    public ImageProductModel(int imageOfProduct) {
        image_of_product = imageOfProduct;
    }

    public int getImage_of_product() {
        return image_of_product;
    }
}
