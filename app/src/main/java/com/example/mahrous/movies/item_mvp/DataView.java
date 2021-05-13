package com.example.mahrous.movies.item_mvp;

import com.example.mahrous.movies.model.MoviesResponse;
import com.example.mahrous.movies.model.TvResponse;

public interface DataView {
    void loadData(MoviesResponse response);

    void loadTvData(TvResponse response);

    void onNoData(String error);

    void hideProgress();

    void showProgress();
}
