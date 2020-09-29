package lucky7;

import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Scanner s=new Scanner(System.in);
        System.out.println("How many dollars do you have? ");
        int money= s.nextInt();
        
        int rolls = 0;
        int money_max = money;
        int roll_max=0;
        
        while (true) {
            d1.Roll();
            d2.Roll();
            int sum = d1.getNumber() + d2.getNumber();
            if (sum == 7) {
                money += 4;
            } else {
                money--;
            }
            rolls++;

            if (money > money_max) {
                money_max = money;
                roll_max = rolls;
            }

            if (money == 0) {
                break;
            }
             
        }
        System.out.format("You are broke after %d rolls \n", rolls);
        System.out.format("You should have quit after %d rolls when you had $%d\n",roll_max,money_max);

    }

}
