package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test
    void addFilmFirst() {
       FilmManager manager = new FilmManager();

       Film film = new Film(1,"Ralph","Comedy","imageUrl");
       Film[] actual = manager.addFilm(film);
       Film[] expected = new Film[] { film };

       assertArrayEquals(expected, actual);
    }

    @Test
    void addFilm() {
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
        FilmManager manager = new FilmManager();
        Film first = new Film(1,"Ralph","Comedy","imageUrl");
        Film second = new Film(1,"Tree","Drama","imageUrl");
        Film third = new Film(1,"Sun","Triller","imageUrl");
        Film forth = new Film(1,"Women","Comedy","imageUrl");
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(forth);

        Film[] actual = new Film[]{forth,third,second,first};
        Film[] expected = manager.showFilms();

        assertArrayEquals(actual, expected);
    }
    @Test
    void showFilmsWithParam() {
        FilmManager manager = new FilmManager(3);
        Film first = new Film(1,"Ralph","Comedy","imageUrl");
        Film second = new Film(1,"Tree","Drama","imageUrl");
        Film third = new Film(1,"Sun","Triller","imageUrl");
        Film forth = new Film(1,"Women","Comedy","imageUrl");
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(forth);

        Film[] actual = new Film[]{forth,third,second};
        Film[] expected = manager.showFilms();

        assertArrayEquals(actual, expected);
    }

    @Test
    void showFilmsWithLimit() {
        FilmManager manager = new FilmManager();
        Film first = new Film(1,"Ralph","Comedy","imageUrl");
        Film second = new Film(1,"Tree","Drama","imageUrl");
        Film third = new Film(1,"Sun","Triller","imageUrl");
        Film forth = new Film(1,"Women","Comedy","imageUrl");
        Film fifth = new Film(1,"Man","Comedy","imageUrl");
        Film sixth = new Film(1,"Flower","Comedy","imageUrl");
        Film seventh = new Film(1,"Books","Comedy","imageUrl");
        Film eighth = new Film(1,"Elephant","Comedy","imageUrl");
        Film ninth = new Film(1,"Piano","Comedy","imageUrl");
        Film tenth = new Film(1,"Game","Comedy","imageUrl");

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(forth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] actual = new Film[]{tenth,ninth,eighth,seventh,sixth,fifth,forth,third,second,first};
        Film[] expected = manager.showFilms();

        assertArrayEquals(actual, expected);
    }

    @Test
    void showFilmsWithLimitMoreThenTen() {
        FilmManager manager = new FilmManager(11);
        Film first = new Film(1,"Ralph","Comedy","imageUrl");
        Film second = new Film(1,"Tree","Drama","imageUrl");
        Film third = new Film(1,"Sun","Triller","imageUrl");
        Film forth = new Film(1,"Women","Comedy","imageUrl");
        Film fifth = new Film(1,"Man","Comedy","imageUrl");
        Film sixth = new Film(1,"Flower","Comedy","imageUrl");
        Film seventh = new Film(1,"Books","Comedy","imageUrl");
        Film eighth = new Film(1,"Elephant","Comedy","imageUrl");
        Film ninth = new Film(1,"Piano","Comedy","imageUrl");
        Film tenth = new Film(1,"Game","Comedy","imageUrl");

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(forth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);

        Film[] actual = new Film[]{tenth,ninth,eighth,seventh,sixth,fifth,forth,third,second,first};
        Film[] expected = manager.showFilms();

        assertArrayEquals(actual, expected);
    }
    @Test
    void showFilmsWithLimitMoreThenTenShow() {
        FilmManager manager = new FilmManager(11);
        Film first = new Film(1,"Ralph","Comedy","imageUrl");
        Film second = new Film(1,"Tree","Drama","imageUrl");
        Film third = new Film(1,"Sun","Triller","imageUrl");
        Film forth = new Film(1,"Women","Comedy","imageUrl");
        Film fifth = new Film(1,"Man","Comedy","imageUrl");
        Film sixth = new Film(1,"Flower","Comedy","imageUrl");
        Film seventh = new Film(1,"Books","Comedy","imageUrl");
        Film eighth = new Film(1,"Elephant","Comedy","imageUrl");
        Film ninth = new Film(1,"Piano","Comedy","imageUrl");
        Film tenth = new Film(1,"Game","Comedy","imageUrl");
        Film eleventh = new Film(1,"Next","Comedy","imageUrl");
        Film twelfth = new Film(1,"Twelfth","Comedy","imageUrl");

        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(forth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);
        manager.addFilm(twelfth);

        Film[] actual = new Film[]{twelfth,eleventh,tenth,ninth,eighth,seventh,sixth,fifth,forth,third,second};
        Film[] expected = manager.showFilms();

        assertArrayEquals(actual, expected);
    }
}