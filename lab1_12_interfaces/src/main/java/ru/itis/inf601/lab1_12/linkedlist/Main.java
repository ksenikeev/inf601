package ru.itis.inf601.lab1_12.linkedlist;

public class Main {
    static void main() {
        Node node1 = new Node(1);

        Node node2 = new Node(2);
        //связываем 1-й и 2-й узлы
        node1.setNext(node2);

        Node node3 = new Node(3);
        node2.setNext(node3);

        Node node4 = new Node(4);
        node3.setNext(node4);

//        System.out.println(node1);
//        System.out.println(node1.getNext());
//        System.out.println(node1.getNext().getNext());
//        System.out.println(node1.getNext().getNext().getNext());

        Node current = node1;
        for (int i = 0; i < 4; ++i) {
            System.out.println(current);
            // переходим к следующему элементу
            current = current.getNext();
        }
        System.out.println(current);

        // Добавление в конец
        // 1. от 1-го элемента переходим последовательно к последнему
        // 2. Создаем новый узел
        // 3. Проставляем ссылку next в последнем элементе на вновь созданный
        current = node1;
        while (current.getNext() != null) {
            current = current.getNext();
        } //1
        Node newNode = new Node(5);//2
        current.setNext(newNode); //3

        // печатаем
        current = node1;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }

    }
}
