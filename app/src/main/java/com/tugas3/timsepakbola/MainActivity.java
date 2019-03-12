package com.tugas3.timsepakbola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    RecyclerView rv_team1,rv_team2,rv_team3;
    FootballAdapter adapter;
    FootballData data;
    ArrayList<FootballModel> footballModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_team1 = findViewById(R.id.rv_team_v);
        rv_team1.setLayoutManager(new LinearLayoutManager(this));
        adapter = new FootballAdapter(this, footballModels);
        rv_team1.setAdapter(adapter);
        data = new FootballData(this, this);
        data.setData();

        rv_team2 = findViewById(R.id.rv_team_h);
        rv_team2.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL, true));
        adapter = new FootballAdapter(this, footballModels);
        rv_team2.setAdapter(adapter);
        data = new FootballData(this, this);
        data.setData();

        rv_team3 = findViewById(R.id.rv_team_g);
        rv_team3.setLayoutManager(new GridLayoutManager(this, 3));
        adapter = new FootballAdapter(this, footballModels);
        rv_team3.setAdapter(adapter);
        data = new FootballData(this, this);
        data.setData();
    }

    @Override
    public void onSuccess(List<FootballModel> footballModels) {
        this.footballModels.clear();
        this.footballModels.addAll(footballModels);
        this.adapter.notifyDataSetChanged();
    }
}