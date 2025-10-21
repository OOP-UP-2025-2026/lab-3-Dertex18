package org.example.task2;

public class Instack {

    // Приватні поля (зовнішній користувач не знає, що тут масив)
    private int[] elements;   // масив для збереження елементів
    private int size;         // кількість елементів у стеку
    private static final int INITIAL_CAPACITY = 10; // початкова місткість

    // Конструктор без параметрів
    public void IntStack() {
        this.elements = new int[INITIAL_CAPACITY];
        this.size = 0;
    }

    // Метод для додавання елемента у стек
    public void push(int value) {
        if (this.size == this.elements.length) {
            expandCapacity(); // якщо масив переповнений, збільшуємо його розмір
        }
        this.elements[this.size] = value;
        this.size++;
    }

    // Метод для зняття елемента зі стеку (повертає верхній елемент)
    public int pop() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Стек порожній — неможливо витягти елемент!");
        }
        this.size--;
        return this.elements[this.size];
    }

    // Метод для перегляду верхнього елемента без зняття
    public int peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Стек порожній — немає елемента для перегляду!");
        }
        return this.elements[this.size - 1];
    }

    // Метод для перевірки, чи порожній стек
    public boolean isEmpty() {
        return this.size == 0;
    }

    // Метод для отримання кількості елементів
    public int size() {
        return this.size;
    }

    // Метод для очищення стеку
    public void clear() {
        this.size = 0;
        this.elements = new int[INITIAL_CAPACITY];
    }

    // Приватний допоміжний метод — "розширення" масиву
    private void expandCapacity() {
        int newCapacity = this.elements.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(this.elements, 0, newArray, 0, this.size);
        this.elements = newArray;
    }

    // Перевизначення методу toString для зручного виведення
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("IntStack [");
        for (int i = 0; i < this.size; i++) {
            builder.append(this.elements[i]);
            if (i < this.size - 1) builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }
}
