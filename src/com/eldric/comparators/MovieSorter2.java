package com.eldric.comparators;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by eldric on 22/08/17.
 */
public class MovieSorter2 {

    public static void main(String[] args) {

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie(1, 3, "True Lies", LocalDate.now().minusYears(23).getYear()));
        movieList.add(new Movie(2, 6, "Cast Away", LocalDate.now().minusYears(16).getYear()));
        movieList.add(new Movie(3, 5, "Dunkirk", LocalDate.now().getYear()));
        movieList.add(new Movie(4, 8, "Original Sin", LocalDate.now().minusYears(16).getYear()));
        movieList.add(new Movie(5, 9, "Conjuring", LocalDate.now().minusYears(4).getYear()));
        movieList.add(new Movie(6, 7, "Annabelle", LocalDate.now().minusYears(3).getYear()));
        movieList.add(new Movie(7, 2, "Titanic", LocalDate.now().minusYears(20).getYear()));

        movieList.stream()
                .sorted((m1, m2) -> m1.getRanking().compareTo(m2.getRanking()))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("======NOW WILL SORT AND PRINT IN REVERSE ORDER======");

        movieList.stream()
                .sorted((m1,m2) -> m2.getRanking().compareTo(m1.getRanking()))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }


    final static class Movie {
        final int id;
        final int ranking;
        final String name;
        final int releaseYear;

        public Movie(int id, int ranking, String name, int releaseYear) {
            this.id = id;
            this.ranking = ranking;
            this.name = name;
            this.releaseYear = releaseYear;

        }

        public Integer getRanking() {
            return this.ranking;
        }

        public String toString() {
            return this.ranking + ":" + this.name + ":" + this.releaseYear;

        }
    }
}
