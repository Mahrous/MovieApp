package com.example.mahrous.movies.item_details_mvp;


import com.example.mahrous.movies.model.MovieDetailsResponse;
import com.example.mahrous.movies.model.TvDetailsResponse;
import com.example.mahrous.movies.model.VideoResponse;

interface ItemDetailsInterActor {

    interface OnCastFinished {

        void onSuccess(MovieDetailsResponse movieDetailsResponse);

        void onTvSuccess(TvDetailsResponse response);

        void onTrailersLoaded(VideoResponse response);

        void onError(String e);
    }

    void getMovieDetails(OnCastFinished onCastFinished, int type);

    void getTrailers(OnCastFinished ended, int type);

}
