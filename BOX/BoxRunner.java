package BOX;

public class BoxRunner {
    public static void main(String[]args){
        Box box = new Box(6,2);
        System.out.println(box.getArea());
        box.bigger(2);
        System.out.println(box.getPerimeter());
    }
}
