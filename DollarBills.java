import java.util.Scanner;

public class DollarBills {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
    
        int n = in.nextInt();

        //NMinimum number of bills needed.
        int bills = 0;

        //Calculate number of 100 dollar bills and adjust accordingly.
        bills += n / 100;
        n = n % 100;

        //Calculate number of 20 dollar bills and adjust accordingly.
        bills += n / 20;
        n = n % 20;

        //Calculate number of 10 dollar bills and adjust accordingly.
        bills += n / 10;
        n = n % 10;

        //Calculate number of 5 dollar bills and adjust accordingly.
        bills += n / 5;
        n = n % 5;

        //The final remainder is the number of 1 dollar bills. Add this to bills.
        bills += n;

        System.out.println(bills);

        in.close();

    }
    
}
