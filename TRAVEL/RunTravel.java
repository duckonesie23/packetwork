package TRAVEL;

public class RunTravel {
    public static void main(String[]args){
    for(int i = 6;i<=40;i+=2){
        Travel travel = new Travel(i);
        System.out.println("people = "+i+", vans = "+travel.goByVan()+", canoes = "+travel.goByCanoe()+", planes = "+travel.goByPlane());
    }
}
}
