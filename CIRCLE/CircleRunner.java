package CIRCLE;

public class CircleRunner {
    public static void main(String[]args){
        Circle circ = new Circle(3);
        System.out.println(circ.getC());
        System.out.println(circ.getArea());
        circ.changeR(1);
        System.out.println(circ.getArea());
    }
}
