package com.tugas3.timsepakbola;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class FootballData {
    Context context;
    List<FootballModel> footballModels = new ArrayList<>();
    MainView view;
    public FootballData(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        FootballModel foot;

        foot = new FootballModel("Arema FC", R.drawable.arema);
        footballModels.add(foot);
        foot = new FootballModel("Persebaya Surabaya", R.drawable.persebaya);
        footballModels.add(foot);
        foot = new FootballModel("Persib Bandung", R.drawable.persib);
        footballModels.add(foot);
        foot = new FootballModel("Persija Jakarta", R.drawable.persija);
        footballModels.add(foot);
        foot = new FootballModel("PSIS Semarang", R.drawable.psis);
        footballModels.add(foot);
        foot = new FootballModel("PSM Makassar", R.drawable.psm);
        footballModels.add(foot);
        foot = new FootballModel("Persipura Jayapura", R.drawable.persipura);
        footballModels.add(foot);

        view.onSuccess(footballModels);

    }
}