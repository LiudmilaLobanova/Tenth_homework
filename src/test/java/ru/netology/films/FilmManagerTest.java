package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shouldAddFilms() {
        String film1 = "Matrix";
        String film2 = "Don't look up";
        String film3 = "Forrest Gump";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {film1, film2, film3};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastFilmFirst() {
        String film1 = "Matrix";
        String film2 = "Don't look up";
        String film3 = "Forrest Gump";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);


        String[] expected = {film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastFilmFirstWithLimit() {
        String film1 = "Matrix";
        String film2 = "Don't look up";
        String film3 = "Forrest Gump";

        FilmManager manager = new FilmManager(2);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);


        String[] expected = {film3, film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
