import java.util.Scanner;

public class CleaningPlates{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int days = in.nextInt();
        int bowls = in.nextInt();
        int plates = in.nextInt();

        in.nextLine();

        int[] dishes = new int[days];

        //Populate the array with which type of meal (1 or 2) he will eat on day i.
        for (int i = 0; i < days; i++){
            dishes[i] = in.nextInt();
        }

        //Variable to count the number of dishes he has to clean.
        int cleaning = 0;

        //For each day...
        for (int i = 0; i < days; i++){
            //If the dish is dish #1, he can only use bowls.
            if (dishes[i] == 1){
                //If no bowls are left, he has to clean.
                if (bowls == 0){
                    cleaning++;
                }
                //If there are bowls remaining, he uses one of them.
                else{
                    bowls--;
                }
            }
            
            //If the dish is dish #2, he can use a bowl OR a plate.
            else if (dishes[i] == 2){
                //If there are no bowls or plates, he must clean one.
                if (bowls == 0 && plates == 0){
                    cleaning++;
                }
                //If there are some bowls and no plate (or vice versa), he uses one.
                else if (bowls != 0 && plates == 0){
                    bowls--;
                }
                else if (bowls == 0 && plates != 0){
                    plates--;
                }
                //If there are bowls and plates available, we assume he uses plates first
                // since the other dish can only use bowls.
                else{
                    //Assume he uses plates first.
                    plates--;
                }
            }

        }

        in.close();
        System.out.println(cleaning);

    }
    
}
