package org.knit.lab2.Task4;

class Container {
    private double capacity;
    private double currentVolume;

    public Container(double capacity) {
        this.capacity = capacity;
        this.currentVolume = 0;
    }

    public void add(Shape shape) {
        double shapeVolume = shape.getVolume();

        if (currentVolume + shapeVolume <= capacity) {
            currentVolume += shapeVolume;
            System.out.println("Фигура добавлена. Осталось места: " + (capacity - currentVolume));
        } else {
            System.out.println("Невозможно добавить фигуру. Недостаточно места.");
        }
    }
}