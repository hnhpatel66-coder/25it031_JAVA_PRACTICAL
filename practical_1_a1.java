import java.util.Scanner;

public class practical_1_a1 {

    enum Coin { ONE, TWO, FIVE, TEN }

    public static void main(String[] args) {
        final int PRICE = 15;           
        int total = 0;                  
        Scanner sc = new Scanner(System.in);

        System.out.println("Snack price: " + PRICE);
        System.out.println("Insert coins (ONE, TWO, FIVE, TEN):");

      
        while (total < PRICE) {
            System.out.print("Coin: ");
            String input = sc.next().toUpperCase();    
           
            Coin coin;
            try {
                coin = Coin.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("  Not a valid coin, try again.");
                continue;                                // ask again
            }

            switch (coin) {
                case ONE:
                        total+=1;
                    break;

                case TWO:
                        total+=2;
                    break;
                    
                case FIVE:
                        total+=5;
                    break;    
            
                case TEN:
                        total+=10;
                    break;
            }
     
            System.out.println("  Inserted so far: " + total);
        }

    
        System.out.println("Paid. Change: " + (total - PRICE));
        sc.close();
    }
}