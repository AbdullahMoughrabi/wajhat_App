package com.example.wajhat.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wajhat.Activities.ProductDetail;
import com.example.wajhat.Models.ProductsModel;
import com.example.wajhat.R;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {
    // region data
    private final Context context;
    private final ProductsModel[] productsList;

    // constructor
    public ProductsAdapter(Context context, ProductsModel[] productsList) {
        this.context = context;
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
    public void onBindViewHolder(@NonNull ProductViewHolder holder, @SuppressLint("RecyclerView") int position) {
        final ProductsModel productsData = productsList[position];
        holder.title_of_product.setText(productsData.getTitle_of_product());
        holder.new_price_of_product.setText(productsData.getNew_price_of_product());
        holder.old_price_of_product.setText(productsData.getOld_price_of_product());
        holder.discount_product.setText(productsData.getDiscount_of_product());
        holder.image_of_product.setImageResource(productsData.getImage_of_product());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent ;
                if(position == 0)
                {
                    intent = new Intent(context , ProductDetail.class);
                    context.startActivity(intent);
                } else if (position == 1) {
                    intent = new Intent(context, ProductDetail.class);
                    context.startActivity(intent);
                } else if (position == 2) {
                    intent = new Intent(context , ProductDetail.class);
                    context.startActivity(intent);
                } else if (position == 3) {
                    intent = new Intent(context , ProductDetail.class);
                    context.startActivity(intent);
                }
            }
        });
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
        public LinearLayout cardView;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            title_of_product = itemView.findViewById(R.id.title_of_product_view);
            new_price_of_product = itemView.findViewById(R.id.new_price_of_product_view);
            old_price_of_product = itemView.findViewById(R.id.old_price_of_product_view);
            discount_product = itemView.findViewById(R.id.discount_of_product_veiw_text);
            image_of_product = itemView.findViewById(R.id.image_of_product_view);
            cardView = itemView.findViewById(R.id.product_item_card);
        }
    }
}
