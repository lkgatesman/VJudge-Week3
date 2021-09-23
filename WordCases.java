import java.util.Scanner;

public class WordCases {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        //Take in the input string and convert it to an array of characters.
        String word = in.nextLine();
        Character[] chars = new Character[word.length()];
        for (int i = 0; i < word.length(); i++){
            chars[i] = word.charAt(i);
        }

        //Counters for the number of lowercase and the number of uppercase letters in the word.
        int lowercase = 0;
        int uppercase = 0;

        for (int i = 0; i < chars.length; i++){
            //If the character is lowercase, increment counter for lowercase.
            if (Character.isLowerCase(chars[i])){
                lowercase++;
            }
            //Else, the character must be uppercase. Increment the counter for the uppercase.
            else{
                uppercase++;
            }
            //If either of the counters are greater than the length of the word divided by 2, 
            //then we know our answer and can break the for loop.
            if (uppercase > (word.length() / 2) || lowercase > (word.length() / 2)){
                break;
            }
        }

        //If there are strictly more uppercase letters, we are printing the word in all uppercase.
        if (uppercase > lowercase){
            System.out.println(word.toUpperCase());
        }
        //Else, print the word in lowercase.
        else{
            System.out.println(word.toLowerCase());
        }

        in.close();

    }
}
