//Audrey Tabler 700718345
//This program uses a method to removes duplicate elements from an arrayList


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //create arraylist
        ArrayList<String> list1 = new ArrayList<>();
        //prompt for user input
        System.out.println("Please enter 10 Strings: ");
        for (int i = 0; i < 10; i++){
            list1.add(input.next());
        }
        System.out.print("The distinct Strings are: ");
        removeDuplicates(list1);

    }//end main
    public static void removeDuplicates(ArrayList<String> list){
        ArrayList<String> noDupes = new ArrayList<>(); //new arraylist to hold the array without duplicates
        //puts each element from list into noDupes unless it is already in noDupes
        for (int i = 0; i < list.size(); i++){
            if (noDupes.contains(list.get(i)) == false){
                noDupes.add(list.get(i));
            }
        }
        System.out.println(noDupes);
    }
}//end class
