//Audrey Tabler
//This program swaps the case (capital or lower) of each char in a string
import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt for user input
        System.out.print("Please enter a String: ");

        //calls swapCase and prints results
        System.out.println("The new string is: " + swapCase(input.nextLine()));
    }

    public static StringBuilder swapCase(String s){ //swapcase method
        StringBuilder str = new StringBuilder(s);

        for (int i = 0; i<str.length(); i++){

            if (Character.isLowerCase(str.charAt(i)) == true) //checks if character at current index is lowercase
                str.setCharAt(i, Character.toUpperCase(str.charAt(i))); //modifies str

            else if (Character.isUpperCase(str.charAt(i)) == true) //checks if character at current index is uppercase
                str.setCharAt(i, Character.toLowerCase(str.charAt(i))); //modifies str


            //str = str.replace(str.charAt(i),cha.charAt(0));

        }
        return str; //returns the output
    }
}


        /*String output = "";

        String cha;
        for (int i = 0; i<str.length(); i++){
            cha = Character.toString(str.charAt(i));

            if (Character.isLowerCase(str.charAt(i)) == true) //checks if character at current index is lowercase
                cha = cha.toUpperCase();
            else if (Character.isUpperCase(str.charAt(i)) == true) //checks if character at current index is uppercase
                cha = cha.toLowerCase();


            //str = str.replace(str.charAt(i),cha.charAt(0));
            output = output.concat(cha); //concatenates the changed char onto our output variable and updates output variable

        }
        str = new StringBuilder(output);
        return str; //returns the output

         */