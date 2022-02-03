package ru.netology.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FilmManager {
    private FilmElement[] films = new FilmElement[0];
    private int limitFilmShow = 10;

//конструктор с заданым кол-во фильмов для вывода на экран
    public FilmManager(int limitFilmShow) {
        this.limitFilmShow = limitFilmShow;
            }

    public FilmElement[] addFilm(FilmElement film) {
//создаем массив на один элемент больше
        int length = films.length + 1;
        FilmElement tmp[] = new FilmElement[length];

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

    public FilmElement[] showFilms(int limitFilmShow) {
//вычисляем какой длинны должен быть массив выводимый на экран
        int resultLength = limitFilmShow;
        if (resultLength <= 10) {
            resultLength = resultLength;
        } else {
            resultLength = 10;
        }
//создаем массив который будем выводить
        FilmElement[] filmShown = new FilmElement[resultLength];
//складываем данные в созданный массив в обратном порядке
        for (int i = 0; i < filmShown.length; i++) {
            int index = films.length - i - 1;
            filmShown[i] = films[index];
        }
        return filmShown;
    }
}
