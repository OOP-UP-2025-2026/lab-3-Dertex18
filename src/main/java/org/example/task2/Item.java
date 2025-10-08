package org.example.task2;

public class Item {

    // Приватні поля
    private long id;
    private String name;
    private double price;

    // Конструктор з використанням this
    public Item(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Гетери (для доступу з інших класів)
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // Сетери (якщо потрібно змінювати дані)
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
    }
}
