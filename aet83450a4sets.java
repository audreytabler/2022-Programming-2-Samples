
//Audrey Tabler
//This program prompts users for two arrays and then generates a union and intersection of arrays
import java.util.Scanner;

public class aet83450a4sets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int b = 0;
        int finIndex =0;

        int[] arrayA1 = new int[21];
        int[] arrayB1 = new int[21];
        boolean isInArray = false;

        // Array A

        System.out.print("Please enter integers (1-20) for array A and enter 0 when finished: "); // prompt for user input
                                                                                                  
        for (int i = 0; (x!=0);) { //loops until user enters 0
            isInArray = false;
            x = input.nextInt();
            
            for (int a = 0; (a < arrayA1.length); a++) { //checks array to see if input is already in array
                if (arrayA1[a] == x) {
                    isInArray = true; //flags as true
                }
            }
            if (isInArray == false){ // if input wasn't in array, this sets index of i to user input & increments i
                arrayA1[i] = x;
                i++;
                finIndex++;
            }
        
        }
        int [] arrayA = new int[finIndex]; //creates new array sized for all numbers in A1 until 0
        for (int i = 0; (arrayA1[i] != 0); i++) { // puts array A1 into the fitted array
        arrayA[i] = arrayA1[i];
        }
        

        System.out.print("A = { ");
        for (int i = 0; (i < arrayA.length); i++) { // displays array A
            System.out.print(arrayA[i] + " ");
        }
        System.out.print("}\n\n");



        //Array B

        System.out.print("Please enter integers (1-20) for array B and enter 0 when finished: "); // prompt for user input
        x=1;
        finIndex = 0;
                                                                                                  
        for (int i = 0; (x!=0);) { //loops until user enters 0
            isInArray = false;
            x = input.nextInt();
            for (int a = 0; (a < arrayB1.length); a++) { //checks array to see if input is already in array
                if (arrayB1[a] == x) { 
                    isInArray = true; //flags as true
                } 
            }
            if (isInArray == false){ // if input wasn't in array, this sets index of i to user input & increments i
                arrayB1[i] = x;
                i++;
                finIndex++;
            }
        }
        int [] arrayB = new int[finIndex]; //creates new array sized for all numbers in A1 until 0

        for (int i = 0; (arrayB1[i] != 0); i++) { // puts array A1 into the fitted array
            arrayB[i] = arrayB1[i];
        }
    

        System.out.print("B = { ");
        for (int i = 0; (i < arrayB.length); i++) { // displays array B
            System.out.print(arrayB[i] + " ");
        }
        System.out.print("}\n\n");


        // Union
        // ----------------------------------------------

        
        int[] arrayAll = new int[arrayA.length + arrayB.length];
        int[] arrayIntersection = new int[arrayA.length + arrayB.length];

        b = 0;
        int intersection = 0;

        for (int i = 0; (i < arrayAll.length); i++) { //loops through entire combined array
            if (i < arrayA.length) { //while index is less than length of first array, put elements from A into union
                arrayAll[i] = arrayA[i];
            }

            if (i >= arrayA.length) { //while index is greater than length of first array, put elements from B into union
                if (b < arrayB.length) { 
                    for (int a = 0; ((a < arrayAll.length) && (b <arrayB.length)); a++) { //checks through entire union array against what element of 
                                                                                         //B we're inserting 
                        if (arrayAll[a] == arrayB[b]) {          //in order to prevent duplicate elements
                            arrayIntersection[intersection] = arrayB[b]; //puts elements found in both array into intersection
                            intersection++;
                            b++; //b represents index of arrayB we're on
                            a = 0; 
                        }
                    }
                    if (b < arrayB.length) {  
                        arrayAll[i] = arrayB[b]; //if element has reached this point, this means there is no duplicates of the element so it is inserted into union
                        b++;
                    }
                }
            }
        }
        System.out.print("A U B = { ");
        for (int i = 0; (arrayAll[i] != 0); i++) { // displays combination of both arrays
            System.out.print(arrayAll[i] + " ");
        }
        System.out.print("}\n\n");


        //Intersection
        //--------------------------------
        System.out.print("A ∩ B = { ");
        for (int i = 0; (arrayIntersection[i] != 0); i++) { // displays intersection of both arrays
            System.out.print(arrayIntersection[i] + " ");
        }
        System.out.print("}\n\n");

        //Difference of A - B
        //-----------------------------
        int [] arrayDiff = new int[arrayA.length];
        b = 0;
    
        for (int i = 0; (i < arrayA.length); i++) {
            isInArray = false;
            for (int y = 0; (y < arrayB.length); y++) { //looks through array B to see if element occours
                if (arrayA[i] == arrayB[y])
                    isInArray = true; //if it finds element, it flags this as true
            }  
            if (isInArray == false) // if it didnt find the element in B it puts the element in this index of arrayDiff
                arrayDiff[i] = arrayA[i];  
        }

        System.out.print("A - B = { ");
        for (int i = 0; (arrayDiff[i] != 0); i++) { // displays difference of A & B
            System.out.print(arrayDiff[i] + " ");
        }
        System.out.print("}");


    }

}
