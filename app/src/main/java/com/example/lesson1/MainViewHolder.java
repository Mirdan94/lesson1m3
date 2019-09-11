package com.example.lesson1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    private  TextView textview;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        textview = itemView.findViewById(R.id.tv_text_view);
    }


    public void onBind (String text) {
        textview.setText(text);
    }
}
