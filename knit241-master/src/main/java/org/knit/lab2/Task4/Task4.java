package org.knit.lab2.Task4;

public class Task4 {

    public void execute() {
        Container container = new Container(500);

        Shape sphere = new Sphere(5);
        Shape cube = new Cube(3);
        Shape cylinder = new Cylinder(3, 10);

        container.add(sphere);
        container.add(cube);
        container.add(cylinder);
    }
}