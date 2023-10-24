package com.example.wajhat.Models;

import com.example.wajhat.R;

public class BecomeRecentModel {
    private final String title_of_become_recent;
    private final String price_of_become_recent;
    private final int image_of_become_recent;

    public static final BecomeRecentModel[] products = new BecomeRecentModel[]{
            new BecomeRecentModel("طارة تطريز","60.000 ل.س",R.drawable.first_product),
            new BecomeRecentModel("لعبة مكعبات","30.000 ل.س",R.drawable.blocks),
            new BecomeRecentModel("شمع معطر برائحة الورد","150.000 ل.س",R.drawable.candle_rose),
            new BecomeRecentModel("ورد الجوري","40.000 ل.س",R.drawable.jurry_flower),
    };

    public BecomeRecentModel(String titleOfBecomeRecent, String priceOfBecomeRecent, int imageOfBecomeRecent) {
        title_of_become_recent = titleOfBecomeRecent;
        price_of_become_recent = priceOfBecomeRecent;
        image_of_become_recent = imageOfBecomeRecent;
    }

    public String getTitle_of_become_recent() {
        return title_of_become_recent;
    }

    public String getPrice_of_become_recent() {
        return price_of_become_recent;
    }

    public int getImage_of_become_recent() {
        return image_of_become_recent;
    }
}
