package Ex4;

import org.omg.CosNaming.IstringHelper;

public class Triangle extends Shape {
double side1 = 1.0;
double side2 = 1.0;
double side3 = 1.0;
double height;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3, double height) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        return side1* height;
    }

    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", height=" + height +
                ",area= " + this.getArea() +
                ",peri= " + this.getPerimeter() +
                '}';
    }
}
