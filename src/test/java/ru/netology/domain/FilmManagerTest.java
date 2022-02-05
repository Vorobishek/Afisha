package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test
    void addFilmFirst() {
       //FilmElement[] films = new FilmElement;
       FilmManager manager = new FilmManager();

       Film film = new Film(1,"Ralph","Comedy","imageUrl");
       Film[] actual = manager.addFilm(film);
       Film[] expected = new Film[] { film };

       assertArrayEquals(expected, actual);
    }

    @Test
    void addFilm() {
        Film[] films = new Film[4];
        FilmManager manager = new FilmManager();

        Film first = new Film(1,"Ralph","Comedy","imageUrl");
        Film second = new Film(1,"Tree","Drama","imageUrl");
        Film third = new Film(1,"Sun","Triller","imageUrl");
        Film forth = new Film(1,"Women","Comedy","imageUrl");
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(forth);

        Film[] actual = manager.getFilms();
        Film[] expected = new Film[] { first,second,third,forth };

        assertArrayEquals(expected, actual);
    }


    @Test
    void showFilms() {
    }
}