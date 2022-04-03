//Audrey Tabler 700718345
//This program utilizes recursion to create an array that equals the factorial of a user's chosen number when the elements are multiplied together 
import java.util.Scanner;
public class aet83450a10recursion{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int num = -1;

        System.out.print("Enter a positive integer: "); // prompt for user input

        //if user input is negative it will prompt and wait for the user until the user enters a positive integer
        while(num < 0){
            num = input.nextInt();
            if (num<0){
                System.out.print("This integer is negative. Please enter a non negative integer: ");   
            }
        }
        if (num == 0) //checks if user input is 0 since an array of 0 elements would not compile and 0 is a non negative integer
            System.out.println(num + "! is 0");
        else
            System.out.println(num + "! is " + recursion(num));

    }
    public static int recursion(int num){
        
        int count = 0;
        
        //our recursive formula is for all k >= 0, k_(0) = num (user input), k_(n+1) = k_(n) - 1
        int[] array = new int[num]; 
        array[0] = num; // k_(0) = num

        //fills array using our recursive formula
        while (count+1 < num ){
            array[count+1] = array[count] - 1; //k_(n+1) = k_(n) - 1
            count++; //increments variable representing n
        }
        
        int factorial = 1;
        for (int i = 0; (i < array.length); i++) { 
            factorial = factorial * array[i]; //multiplies each element in array together to get the factorial
        }

        return factorial; //returns factorial

    }
}