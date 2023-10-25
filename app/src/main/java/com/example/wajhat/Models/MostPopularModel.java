package com.example.wajhat.Models;

import com.example.wajhat.R;

public class MostPopularModel {
    private final String title_of_most_popular;
    private final String price_of_most_popular;
    private final int image_of_most_popular;

    public static final MostPopularModel[] products = new MostPopularModel[]{
            new MostPopularModel("لعبة قطار السعادة","50.000 ل.س", R.drawable.train_toy),
            new MostPopularModel("شمع معطر","85.000 ل.س",R.drawable.candle_foam),
            new MostPopularModel("سلة خيزران","100.000 ل.س",R.drawable.hand_made_kh),
            new MostPopularModel("ورد الياسمين","70.000 ل.س",R.drawable.jasmin_flower),
    };

    public MostPopularModel(String titleOfMostPopular, String priceOfMostPopular, int imageOfMostPopular) {
        title_of_most_popular = titleOfMostPopular;
        price_of_most_popular = priceOfMostPopular;
        image_of_most_popular = imageOfMostPopular;
    }

    public String getTitle_of_most_popular() {
        return title_of_most_popular;
    }

    public String getPrice_of_most_popular() {
        return price_of_most_popular;
    }

    public int getImage_of_most_popular() {
        return image_of_most_popular;
    }
}
