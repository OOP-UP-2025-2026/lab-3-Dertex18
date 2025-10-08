package org.example.task2;

public class Cart {

    // Приватні поля
    private Item[] items;
    private int count;

    // Конструктор
    public Cart(int capacity) {
        this.items = new Item[capacity];
        this.count = 0;
    }

    // Метод для додавання товару
    public void add(Item item) {
        if (this.count < this.items.length) {
            this.items[this.count] = item;
            this.count++;
        } else {
            System.out.println("Неможливо додати товар: кошик повний!");
        }
    }

    // Метод для видалення товару за id
    public void removeById(long id) {
        int pos = -1;
        for (int i = 0; i < this.count; i++) {
            if (this.items[i].getId() == id) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            for (int i = pos; i < this.count - 1; i++) {
                this.items[i] = this.items[i + 1];
            }
            this.items[this.count - 1] = null;
            this.count--;
            System.out.println("Товар з id " + id + " видалено з кошика.");
        } else {
            System.out.println("Товар з id " + id + " не знайдено.");
        }
    }

    // Метод для отримання кількості елементів
    public int getCount() {
        return this.count;
    }

    // Метод для отримання товару за індексом
    public Item getItem(int index) {
        if (index >= 0 && index < this.count) {
            return this.items[index];
        }
        return null;
    }

    // Метод для обчислення загальної вартості
    public double getTotalPrice() {
        double sum = 0.0;
        for (int i = 0; i < this.count; i++) {
            sum += this.items[i].getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Cart:\n");
        for (int i = 0; i < this.count; i++) {
            builder.append(this.items[i].toString());
        }
        builder.append("------------------\n");
        builder.append("Кількість товарів: ").append(this.count).append("\n");
        builder.append("Загальна сума: ").append(this.getTotalPrice()).append("\n");
        return builder.toString();
    }
}
