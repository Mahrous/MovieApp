package com.example.mahrous.movies.item_mvp;

public interface DataPresenter {
    void getMovies(int page, String type,int rqType);

    void destroy();
}
