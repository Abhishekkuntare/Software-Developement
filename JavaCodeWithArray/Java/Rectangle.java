package com.codewithharry.shape;

public class Rectangle extends Shape {
    Rectangle(int dim1, int dim2) {
        super(dim1, dim2);// calling the Shape constructor with the help of super key word
    }

    public int area() {
        return this.dim1 * this.dim2;
    }
}
