package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,height;

        System.out.println("Nhap a");
        a = input.nextDouble();
        System.out.println("Nhap b");
        b = input.nextDouble();
        System.out.println("Nhap c");
        c = input.nextDouble();
        System.out.println("Nhap height");
        height = input.nextDouble();

        Triangle triangle1 = new Triangle("red",true,a,b,c,height);
        System.out.println(triangle1);
    }
}
