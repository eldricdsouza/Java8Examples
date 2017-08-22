package com.eldric.immutable;

import java.util.Date;
import java.util.List;

/**
 * Created by eldric on 22/08/17.
 */
public final class ImmutableClass {

    private final int movieId;
    private final int rating;
    private final String movieName;
    private final Date releaseDate;
    private final List<String> myList;


    public ImmutableClass(int movieId, int rating, String movieName, Date releaseDate,List<String> list) {
        this.movieId = movieId;
        this.rating = rating;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.myList = list;

    }
}
