package task.dao;

import task.model.Bet;

import java.util.List;

//НАШ КЛАСС ДЛЯ РАБОТЫ С БАЗОЙ ДАННЫХ И ТАБЛИЦОЙ СТАВОК
public interface GeneralizedDao<T> {

    void add(T t);

    List<T> getAll();
}
