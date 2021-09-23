import java.util.Scanner;

public class DinnerWithEmma{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int streets = in.nextInt(); //m = the number of streets
        int avenues = in.nextInt(); //n = the number of avenues

        //Matrix to hold the costs of each restaurant, where [i][j] is the cost of the
        //restaurant at the intersection of street i and avenue j.
        int[][] arr=new int[streets][avenues];

        //Set max value overall.
        int max = Integer.MIN_VALUE;
		
        //Goal: Find the maximum of the minimums. That is the answer.
        for(int i = 0; i < streets; i++) {
		    int min = Integer.MAX_VALUE;    //Set min value for the street we are on.
			for(int j = 0; j < avenues; j++) {
			    arr[i][j] = in.nextInt();
				if(min > arr[i][j]) {
					min = arr[i][j];    //Find the minimum in the street.
                }
			}
            //If the maximum we already have is less than the current minimum, replace the maximum with the
            //new highest minimum.
			if (max < min) {  
			    max = min;
			}
		 }

		 System.out.println(max);
         in.close();
	}
    
}
