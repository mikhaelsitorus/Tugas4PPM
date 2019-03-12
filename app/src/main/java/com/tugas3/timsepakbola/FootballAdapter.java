package com.tugas3.timsepakbola;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.ViewHolder> {
    Context context;
    List<FootballModel> footballModels = new ArrayList<>();

    public FootballAdapter(Context context,List<FootballModel> footballModels) {
        this.context = context;
        this.footballModels = footballModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_football, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvNamateam.setText(footballModels.get(i).getNamaTeam());
        viewHolder.tvLambangTeam.setImageResource(footballModels.get(i).getLambangTeam());
    }

    @Override
    public int getItemCount()  {
        return footballModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView tvLambangTeam;
        TextView tvNamateam;
        TextView overview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLambangTeam = itemView.findViewById(R.id.lambang_team);
            tvNamateam = itemView.findViewById(R.id.nama_team);
        }
    }
}