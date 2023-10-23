package com.example.wajhat.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wajhat.Models.ProductsModel;
import com.example.wajhat.R;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {
    //data
    private final ProductsModel[] productsList;
    //constructor


    public ProductsAdapter(ProductsModel[] productsList) {
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.product_view_item, parent , false);
        return new ProductViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        final ProductsModel productsData = productsList[position];
        holder.title_of_product.setText(productsList[position].getTitle_of_product());
        holder.new_price_of_product.setText(productsList[position].getNew_price_of_product());
        holder.old_price_of_product.setText(productsList[position].getOld_price_of_product());
        holder.discount_product.setText(productsList[position].getDiscount_of_product());
        holder.image_of_product.setImageResource(productsList[position].getImage_of_product());
    }

    @Override
    public int getItemCount() {
        return productsList.length;
    }

    //View Holder
    public static class ProductViewHolder extends RecyclerView.ViewHolder{
        public TextView title_of_product;
        public TextView new_price_of_product;
        public TextView old_price_of_product;
        public TextView discount_product;
        public ImageView image_of_product;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            title_of_product = itemView.findViewById(R.id.title_of_product_view);
            new_price_of_product = itemView.findViewById(R.id.new_price_of_product_view);
            old_price_of_product = itemView.findViewById(R.id.old_price_of_product_view);
            discount_product = itemView.findViewById(R.id.discount_of_product_veiw_text);
            image_of_product = itemView.findViewById(R.id.image_of_product_view);
        }
    }
}
