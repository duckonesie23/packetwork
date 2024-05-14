package DICE;

public class DiceRunner {
    public static void main(String[]args){
        Dice d = new Dice();
        d.roll();
        int n = d.getTotal();
        System.out.println(n);
        for(int i = 0;i<=100;i++){
            d.roll();
            n = d.getTotal();
            System.out.println(n);
        }
    }
}
