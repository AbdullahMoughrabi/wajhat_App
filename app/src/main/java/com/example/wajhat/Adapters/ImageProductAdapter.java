package com.example.wajhat.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wajhat.Models.ImageProductModel;
import com.example.wajhat.R;

public class ImageProductAdapter  extends RecyclerView.Adapter<ImageProductAdapter.ImageProductViewHolder> {
    // Data
    private final Context context;
    private final ImageProductModel[] imageProductList;
    // Constructor
    public ImageProductAdapter(Context context, ImageProductModel[] imageProductList) {
        this.context = context;
        this.imageProductList = imageProductList;
    }

    @NonNull
    @Override
    public ImageProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.images_of_product_item, parent , false);
        return new ImageProductViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageProductViewHolder holder, int position) {
        final ImageProductModel imageProductData = imageProductList[position];
        holder.image_of_product.setImageResource(imageProductData.getImage_of_product());
    }

    @Override
    public int getItemCount() {
        return imageProductList.length;
    }

    // ViewHolder
    public static class ImageProductViewHolder extends RecyclerView.ViewHolder {
        public ImageView image_of_product;

        public ImageProductViewHolder(@NonNull View itemView) {
            super(itemView);
            image_of_product = itemView.findViewById(R.id.img_of_product);
        }
    }
}
