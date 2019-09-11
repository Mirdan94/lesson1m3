package com.example.lesson1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    ArrayList <String> data;

    public MainAdapter () {
        data = new ArrayList<>();
//        for (int i =0; i <= 10; i++) {
//            data.add("I am element number " + i);
//        }

    }

    public void addText (String text) {

        data.add(text);
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_main_view_holder, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {

        if(position == data.size()) {

        } else {

            String text = data.get(position);
            holder.onBind(text);

        }
    }

    @Override
    public int getItemCount() {
        return data.size() + 1;
    }
}
