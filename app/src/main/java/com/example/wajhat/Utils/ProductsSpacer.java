package com.example.wajhat.Utils;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductsSpacer extends RecyclerView.ItemDecoration {
    private final int horizontalSpace;

    public ProductsSpacer(int horizontalSpace) {
        this.horizontalSpace = horizontalSpace;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.left = horizontalSpace;
        outRect.right = horizontalSpace;
    }
}
