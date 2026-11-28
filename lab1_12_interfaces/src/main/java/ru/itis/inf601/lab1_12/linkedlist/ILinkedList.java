package ru.itis.inf601.lab1_12.linkedlist;

public interface ILinkedList {
    int size();
    int get(int position);
    void add(int value, int position); // добавление в указанную позицию
    void delete(int position);
    int pop(); // вернуть последний элемент, и удалить его из списка
    void add(int value); // добавление в конец

    default void push(int value) {
        add(value);
    }
}
