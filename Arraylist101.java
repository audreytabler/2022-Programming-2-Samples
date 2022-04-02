// Audrey Tabler 700718345
//This program prompts for an arraylist and preforms various procedues to modify and displays the results
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list1 = new ArrayList<>(); //create arraylist of doubles

        //prompt for input & fill arraylist
        System.out.print("Enter five numbers for list1: ");
        for (int i = 0; i < 5; i++){
            list1.add(input.nextDouble());
        }


        System.out.println("The contents of this arraylist are: "+list1);

        //use Collections to sort list in acending order & display results
        java.util.Collections.sort(list1);
        System.out.println("The arraylist in acending order is: " + list1);

        //Randomly shuffle the list & use a for loop to display results
        java.util.Collections.shuffle(list1);
        System.out.println("Shuffled list is: ");
        for (int i = 0; i < list1.size(); i++){
            System.out.print(list1.get(i) + " ");
        }

        //display minimum and maximum values
        System.out.println("Minimum value in this list is: " + java.util.Collections.min(list1) + ". Max value in this list is: " + java.util.Collections.max(list1));
    }
}
