package com.example.recycler_view_demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MRecyclerViewAdapter extends RecyclerView.Adapter<MRecyclerViewAdapter.MViewHolder> {

    Context context;
    String[] list;

    public MRecyclerViewAdapter(Context context, String[] list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MRecyclerViewAdapter.MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // This is where you inflate the layout (Give a look to our list items - rows)
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycler_view_row, parent, false);

        return new MRecyclerViewAdapter.MViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MRecyclerViewAdapter.MViewHolder holder, int position) {
        // This is where the recycling of items happens, as they come back on the screen
        // Based on the position of the recycler view (position)
        holder.tv.setText(list[position]);
    }

    @Override
    public int getItemCount() {
        // just the total items length
        return list.length;
    }

    public static class MViewHolder extends RecyclerView.ViewHolder {
        TextView tv;

        public MViewHolder(@NonNull View itemView) {
            super(itemView);

            tv = itemView.findViewById(R.id.textView);
        }
    }
}
