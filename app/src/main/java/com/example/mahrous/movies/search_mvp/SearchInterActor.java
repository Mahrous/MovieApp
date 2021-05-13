package com.example.mahrous.movies.search_mvp;

import com.example.mahrous.movies.model.MoviesResponse;
import com.example.mahrous.movies.model.TvResponse;

public interface SearchInterActor {
    interface OnSearchFinished {
        void onMoviesSearched(MoviesResponse response);

        void onTvSearched(TvResponse response);
    }

    void getSearchedMovies(String q, OnSearchFinished searchFinished, int type);
}
