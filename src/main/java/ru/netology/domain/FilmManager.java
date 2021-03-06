package ru.netology.domain;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FilmManager {
    private Film[] films = new Film[0];
    private int limitFilmShow = 10;

//конструктор с заданым кол-во фильмов для вывода на экран
    public FilmManager(int limitFilmShow) {
        this.limitFilmShow = limitFilmShow;
            }

    public Film[] getFilms() {
        return films;
    }

    public Film[] addFilm(Film film) {
//создаем массив на один элемент больше
        int length = films.length + 1;
        Film tmp[] = new Film[length];

//копируем поэлементно
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }

//добавляем последний наш элемент(новый)
        int lastElement = tmp.length - 1;
        tmp[lastElement] = film;
        films = tmp;
        return films;
    }

    public Film[] showFilms() {
//вычисляем какой длинны должен быть массив выводимый на экран
        int resultLength = limitFilmShow;
        if (resultLength >= films.length ) {
            resultLength = films.length;
        } else {
            resultLength = limitFilmShow;
        }
//создаем массив который будем выводить
        Film[] filmShown = new Film[resultLength];
//складываем данные в созданный массив в обратном порядке
        for (int i = 0; i < filmShown.length; i++) {
            int index = films.length - i - 1;
            filmShown[i] = films[index];
        }
        return filmShown;
    }
}
