package Ex3;

public class Main {
    public static void main(String[] args) {
        Point point = new MovablePoint(6,8,8,9);
        System.out.println(((MovablePoint)point).getSpeed());
        System.out.println(((MovablePoint) point).move());
        MovablePoint point1 = new MovablePoint(6,7,8,9);
        System.out.println(point1);

    }
}
