//Audrey Tabler 700718345
//This program utilizes sentinel loops for users to create two arraylists of ints
//program displays contents of these arraylists and then displays the union of the arraylists

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections.*;

public class ListUnion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialize arraylists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> union = new ArrayList<>();


        //prompt for user input for first list
        System.out.print("Enter numbers for list1 and enter 0 when you are finished: ");

        for (int user = -1; user != 0;){
            user = input.nextInt();
            if (user!=0)
                list1.add(user);
        }
        System.out.println("List 1 is " + list1);

        System.out.print("Enter numbers for list2 and enter 0 when you are finished: ");

        //prompt for user input for the second list
        for (int user = -1; user != 0;){
            user = input.nextInt();
            if (user!=0)
                list2.add(user);
        }
        System.out.println("List 2 is " + list2);

        //call union method & set our union array to the union array returned from the method
        union = union(list1,list2);

        //display results
        System.out.println("union of list1 and list2 is " + union);
    }


    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> union = new ArrayList<>(); // create arraylist to hold union of the two lists
        for (int i = 0; i < list1.size(); i++){
            if (union.contains(list1.get(i)) == false){ // for each element in list 1 it checks to see if its already in the list
                union.add(list1.get(i)); //if it isn't, it adds the element to the union
            }
        }
        for (int i = 0; i < list2.size(); i++){
            if (union.contains(list2.get(i)) == false){ // for each element in list 1 it checks to see if its already in the list
                union.add(list2.get(i)); //if it isn't, it adds the element to the union
            }
        }
        return union;
    }
}
