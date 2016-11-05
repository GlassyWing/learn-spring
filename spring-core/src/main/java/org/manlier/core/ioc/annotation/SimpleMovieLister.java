package org.manlier.core.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by manlier on 2016/10/21.
 */
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    private MovieFinder2 movieFinder2;

    public SimpleMovieLister(MovieFinder movieFinder, MovieFinder2 movieFinder2) {
        this.movieFinder = movieFinder;
        this.movieFinder2 = movieFinder2;
    }

    @Autowired
    public SimpleMovieLister(MovieFinder finder) {
        this.movieFinder = finder;
    }

    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }
}
