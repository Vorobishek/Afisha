package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    @Test
    void addFilm() {
       FilmElement[] films = new FilmElement[];
       FilmManager manager = new FilmManager();

       films[0] = new FilmElement(1,"Ralph","Comedy","imageUrl");
       FilmElement[] actual = manager.addFilm(films[0]);
       FilmElement[] expected = films;


    }

    @Test
    void showFilms() {
    }
}