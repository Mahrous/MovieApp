package com.example.mahrous.movies.watch_later;

import java.util.List;

public interface LaterView {
    void showLater(List<WatchLaterEntity> entityList);

    void showProgress();

    void hideProgress();

}
