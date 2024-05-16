package TRAVEL;

public class Travel {
    private int people;
    public Travel(int n){
        people = n;
    }
    public int goByVan(){
        return ((people-1)/8)+1;
    }
    public int goByCanoe(){
        return ((people-1)/3)+1;
    }
    public int goByPlane(){
        return ((people-1)/12)+1;
    }
}
