package com.tugas3.timsepakbola;

import android.graphics.drawable.Drawable;

public class FootballModel {
    String namaTeam;
    int lambangTeam;
    String overview;

    public FootballModel(String namaTeam, int lambangTeam) {
        this.namaTeam = namaTeam;
        this.lambangTeam = lambangTeam;
    }

    public String getNamaTeam() {
        return namaTeam;
    }

    public int getLambangTeam() {
        return lambangTeam;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

}