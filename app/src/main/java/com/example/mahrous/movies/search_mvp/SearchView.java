package com.example.mahrous.movies.search_mvp;

import com.example.mahrous.movies.model.MoviesResponse;
import com.example.mahrous.movies.model.TvResponse;

public interface SearchView {
    void getSearchedMovies(MoviesResponse response);

    void getSearchedTv(TvResponse response);

    void showSearchProgress();

    void hideSearchProgress();

}
