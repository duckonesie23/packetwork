package CUBE;

public class CubeRunner {
    public static void main(String[]args){
        Cube cube = new Cube(3);
        System.out.println("The surface area is "+cube.surfaceArea()+" sq. units");
        System.out.println("The volume is "+cube.volume()+" cu. units");
        cube.setSideForVolume(125);
        System.out.println("The side is now "+cube.getSide()+" units");
        System.out.println("The surface area is "+cube.surfaceArea()+" sq. units");
    }
}
