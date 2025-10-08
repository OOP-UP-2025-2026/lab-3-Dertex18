package org.example.task2;

public class Order {

    // Приватні поля
    private long id;
    private String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    // Гетери
    public long getId() {
        return this.id;
    }

    public String getCustomer() {
        return this.customer;
    }

    // Формування чеку (рахунку)
    public String formOrderBill(Cart cart) {
        StringBuilder builder = new StringBuilder();
        builder.append("Order №").append(this.id)
                .append(" for customer ").append(this.customer)
                .append("\n------------------\n");

        for (int i = 0; i < cart.getCount(); i++) {
            Item item = cart.getItem(i);
            builder.append("Item id: ").append(item.getId())
                    .append(" | name: ").append(item.getName())
                    .append(" | price: ").append(item.getPrice())
                    .append("\n");
        }

        builder.append("Total sum: ").append(cart.getTotalPrice());

        return builder.toString();
    }
}
