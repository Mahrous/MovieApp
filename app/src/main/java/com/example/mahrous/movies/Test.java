package com.example.mahrous.movies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mahrous.movies.data_repository.ApiClient;
import com.example.mahrous.movies.data_repository.ApiService;
import com.example.mahrous.movies.model.Movie;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        ApiService apiService = ApiClient.getMoviesClient().create(ApiService.class);

        TextView name = findViewById(R.id.name);
        TextView ov = findViewById(R.id.over);

        apiService.getmo(4578, Const.API_KEY).enqueue(new Callback<Movie>() {
            @Override
            public void onResponse(Call<Movie> call, Response<Movie> response) {

                assert response.body() != null;
                name.setText(response.body().getTitle());
                ov.setText(response.body().getOverview());

            }

            @Override
            public void onFailure(Call<Movie> call, Throwable t) {

            }
        });
    }
}
