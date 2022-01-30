package com.example.and34;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ContViewHolder>{

    ArrayList<String> names = new ArrayList<>();

    public Adapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public ContViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContViewHolder holder, int position) {
        holder.bind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    static class ContViewHolder extends RecyclerView.ViewHolder{
        private TextView name;

        public ContViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.names);
        }

        public void bind(String s) {
            name.setText(s);

        }
    }
}