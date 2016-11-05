package org.manlier.core.ioc.annotation;

/**
 * Created by manlier on 2016/10/21.
 */
public class MovieCatalog {

    private static int counter = 0;

    private int id;

    public MovieCatalog() {
        id = counter++;
    }

    @Override
    public String toString() {
        return "MovieCatalog{" +
                "id=" + id +
                '}';
    }
}
