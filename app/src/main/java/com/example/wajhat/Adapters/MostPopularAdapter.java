package com.example.wajhat.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.wajhat.Models.MostPopularModel;
import com.example.wajhat.R;

import org.w3c.dom.Text;

public class MostPopularAdapter extends RecyclerView.Adapter<MostPopularAdapter.MostPopularViewHolder> {
    // Data
    private MostPopularModel[] mostPopularList;

    public MostPopularAdapter(MostPopularModel[] mostPopularList) {
        this.mostPopularList = mostPopularList;
    }

    @NonNull
    @Override
    public MostPopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.most_popular_item , parent , false);
        return new MostPopularViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MostPopularViewHolder holder, int position) {
        final MostPopularModel mostPopularData = mostPopularList[position];
        holder.title_of_most_popular.setText(mostPopularData.getTitle_of_most_popular());
        holder.price_of_most_popular.setText(mostPopularData.getPrice_of_most_popular());
        holder.image_of_most_popular.setImageResource(mostPopularData.getImage_of_most_popular());
    }

    @Override
    public int getItemCount() {
        return mostPopularList.length;
    }

    // ViewHolder
    public static class MostPopularViewHolder extends RecyclerView.ViewHolder {
        public TextView title_of_most_popular;
        public TextView price_of_most_popular;
        public ImageView image_of_most_popular;

        public MostPopularViewHolder(@NonNull View itemView) {
            super(itemView);
            title_of_most_popular = itemView.findViewById(R.id.title_of_most_popular);
            price_of_most_popular = itemView.findViewById(R.id.price_of_most_popular);
            image_of_most_popular = itemView.findViewById(R.id.image_of_most_popular);
        }
    }
}
