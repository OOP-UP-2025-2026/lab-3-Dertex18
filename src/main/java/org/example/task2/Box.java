package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    // Приватні сеттери з перевіркою без кидання винятків
    private void setLength(double length) {
        if (length <= 0) {
            System.out.println(" Неправильна довжина" );
        } else {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if (width <= 0) {
            System.out.println(" Неправильна ширина ");

        } else {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Неправильна висота" );

        } else {
            this.height = height;
        }
    }

    // Площа поверхні: 2(lw + lh + wh)
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    // Площа бічної поверхні: 2h(l + w)
    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    // Об'єм: l * w * h
    public double getVolume() {
        return length * width * height;
    }
}
