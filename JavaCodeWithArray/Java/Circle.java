package com.codewithharry.shape;

public class Circle extends Shape {
    Circle(int dim1, int dim2) {
        super(dim1, -1); // use -1 because the dim2 is not exits
    }

    public double area() {
        return Math.PI * dim1 * dim1;
    }
}
