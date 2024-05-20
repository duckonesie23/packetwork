package SPHERE;

public class RunSphere {
    public static void main(String[]args){
        Sphere x = new Sphere(2);
        System.out.println("The surface area is "+x.surfaceArea()+" sq. units");
        System.out.println("The volume is "+x.volume()+" cu. units");
        System.out.println("Half the volume is "+(x.volume())/2+" cu. units");
        System.out.println("")
    }
}
