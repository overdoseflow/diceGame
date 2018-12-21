package dicegame;

import java.util.Random;

public class diceGame {

    public static void main(String[] args) {
        
        Random r = new Random();
        int dicefirst=0;
        int dicesecond=0;
        int sum = 0;
        int counter =0;
        
        while(sum!=3)
        { counter++;
            dicefirst=r.nextInt(6)+1;
            dicesecond=r.nextInt(6)+1;
            sum = dicefirst + dicesecond;
            System.out.println("The dice come up "+dicefirst+" and "+dicesecond);
        
        }
        System.out.println("It took "+counter+" rolls to get 3.");
    }
    
}
