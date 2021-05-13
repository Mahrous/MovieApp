package com.example.mahrous.movies.item_mvp;

import com.example.mahrous.movies.model.MoviesResponse;
import com.example.mahrous.movies.model.TvResponse;

public interface DataInterActor {
    interface OnFetchEnded {
        void onData(MoviesResponse response);

        void onTvData(TvResponse response);

        void onNowData(String err);
    }

    void getResponse(int page, String type, int reqType, OnFetchEnded ended);
}
