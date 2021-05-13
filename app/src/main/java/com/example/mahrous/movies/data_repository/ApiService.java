package com.example.mahrous.movies.data_repository;

import com.example.mahrous.movies.model.Movie;
import com.example.mahrous.movies.model.MovieDetailsResponse;
import com.example.mahrous.movies.model.MoviesResponse;
import com.example.mahrous.movies.model.TvDetailsResponse;
import com.example.mahrous.movies.model.TvResponse;
import com.example.mahrous.movies.model.VideoResponse;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {


    @GET("movie/{type}")
    Single<MoviesResponse> getMovieList(@Path("type") String type, @Query("api_key") String apiKey, @Query("page") int page);



    @GET("movie/{id}")
    Call<Movie> getmo(@Path("id") int id, @Query("appi_key") String apikey);


    @GET("movie/{type}")
    List<MoviesResponse> getMovieLst(@Path("type") String type, @Query("api_key") String apiKey, @Query("page") int page);


    @GET("movie/{type}")
    Flowable<List<Movie>> getMovieListFlow(@Path("type") String type, @Query("api_key") String apiKey, @Query("page") int page);


    @GET("movie/{id}")
    Single<MovieDetailsResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey, @Query("append_to_response") String credits);

    @GET("movie/{id}/videos")
    Single<VideoResponse> getTrailers(@Path("id") int id, @Query("api_key") String apiKey);

    @GET("search/movie/")
    Single<MoviesResponse> searchMovie(@Query("api_key") String apiKey, @Query("query") String query);

    @GET("trending/all/{time_window}")
    Single<MoviesResponse> getTrending(@Path("time_window") String timeWindow, @Query("api_key") String apiKey, @Query("page") int page);

    @GET("tv/{type}")
    Single<TvResponse> getTvList(@Path("type") String type, @Query("api_key") String apiKey, @Query("page") int page);

    @GET("tv/{id}")
    Single<TvDetailsResponse> getTvDetails(@Path("id") int id, @Query("api_key") String apiKey, @Query("append_to_response") String credits);

    @GET("search/tv/")
    Single<TvResponse> searchTv(@Query("api_key") String apiKey, @Query("query") String query);

    @GET("tv/{id}/videos")
    Single<VideoResponse> getTvTrailers(@Path("id") int id, @Query("api_key") String apiKey);

}
