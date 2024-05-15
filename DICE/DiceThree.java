package DICE;

public class DiceThree {
    public static void main(String[]args){
        Dice deez = new Dice();
        int counter711 = 0;
        int counter2312 = 0;
        for(int i = 0;i<100;i++){
            deez.roll();
            if(deez.getTotal() == 7 || deez.getTotal() == 11)
                counter711++;
            if(deez.getTotal()==2||deez.getTotal()==3||deez.getTotal()==12)
                counter2312++;
        }
        System.out.println("You rolled a 7 or 11\t\t"+counter711+"% of the time.");
        System.out.println("You rolled a 2, 3, or 12\t"+counter2312+"% of the time.");
    }
}
