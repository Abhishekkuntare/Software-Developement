package com.codewithharry.shape;

public class Square extends Shape {
    Square(int dim1, int dim2) {
        super(dim1, -1);// -1 used for we can not use the dim2 in square class
    }

    public int area() {
        return this.dim1 * this.dim1;
    }
}
