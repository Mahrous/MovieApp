package com.example.mahrous.movies.item_details_mvp;


import com.example.mahrous.movies.model.MovieDetailsResponse;
import com.example.mahrous.movies.model.TvDetailsResponse;
import com.example.mahrous.movies.model.VideoResponse;

public interface ItemDetailsView {
    void showProgress();

    void hideProgress();

    void showMovieData(MovieDetailsResponse response);

    void showTvData(TvDetailsResponse response);

    void showTrailers(VideoResponse response);

    void showError(String error);

}
