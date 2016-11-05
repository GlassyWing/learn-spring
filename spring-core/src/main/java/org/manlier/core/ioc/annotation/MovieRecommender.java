package org.manlier.core.ioc.annotation;

import org.manlier.core.ioc.annotation.qualifier.Format;
import org.manlier.core.ioc.annotation.qualifier.MovieQualifier;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * Created by manlier on 2016/10/21.
 */
public class MovieRecommender {

//    @Autowired
//    @Qualifier("main")
    @Resource(name = "main", type = MovieCatalog.class)
    private MovieCatalog movieCatalog;

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Action")
    private MovieCatalog actionVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Comedy")
    private MovieCatalog comedyVhsCatalog;

    @Autowired
    @MovieQualifier(format=Format.DVD, genre="Action")
    private MovieCatalog actionDvdCatalog;

    @Autowired
    @MovieQualifier(format=Format.BLURAY, genre="Comedy")
    private MovieCatalog comedyBluRayCatalog;

    @Override
    public String toString() {
        return "MovieRecommender{" +
                "movieCatalog=" + movieCatalog +
                ", actionVhsCatalog=" + actionVhsCatalog +
                ", comedyVhsCatalog=" + comedyVhsCatalog +
                ", actionDvdCatalog=" + actionDvdCatalog +
                ", comedyBluRayCatalog=" + comedyBluRayCatalog +
                '}';
    }
}
