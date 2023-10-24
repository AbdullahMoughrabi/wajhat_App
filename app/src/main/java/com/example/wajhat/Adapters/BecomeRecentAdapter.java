package com.example.wajhat.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wajhat.Models.BecomeRecentModel;
import com.example.wajhat.R;

public class BecomeRecentAdapter extends RecyclerView.Adapter<BecomeRecentAdapter.BecomeRecentViewHolder> {
    //Data
    private final BecomeRecentModel[] becomeRecentList;

    public BecomeRecentAdapter(BecomeRecentModel[] becomeRecentList) {
        this.becomeRecentList = becomeRecentList;
    }

    @NonNull
    @Override
    public BecomeRecentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.become_recent_item, parent, false);
        return new BecomeRecentViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull BecomeRecentViewHolder holder, int position) {
        final BecomeRecentModel productsData = becomeRecentList[position];
        holder.title_of_become_recent.setText(productsData.getTitle_of_become_recent());
        holder.price_of_become_recent.setText(productsData.getPrice_of_become_recent());
        holder.image_of_become_recent.setImageResource(productsData.getImage_of_become_recent());
    }

    @Override
    public int getItemCount() {
        return becomeRecentList.length;
    }

    // View Holder
    public static class BecomeRecentViewHolder extends RecyclerView.ViewHolder{
        public TextView title_of_become_recent;
        public TextView price_of_become_recent;
        public ImageView image_of_become_recent;

        public BecomeRecentViewHolder(@NonNull View itemView) {
            super(itemView);
            title_of_become_recent = itemView.findViewById(R.id.title_of_become_recent);
            price_of_become_recent = itemView.findViewById(R.id.price_of_become_recent);
            image_of_become_recent = itemView.findViewById(R.id.image_of_become_recent);
        }
    }
}
