package com.example.mahrous.movies.item_details_mvp;

public interface ItemDetailsPresenter {

    void getMovieDetails(int type);

    void getTrailers(int type);

    void destroy();
}
