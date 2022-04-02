//Audrey Tabler 700718345
//This program simulates ATM machine
import java.util.Scanner;
public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10]; //creates array capable of holding 10 account objects
        for(int i =0; i < accounts.length; i++){ //fills array
            accounts[i] = new Account(i,100);
        }
        int menu = 0; //initializes menu to 0
        System.out.println("- Welcome to the ATM -");
        while (menu == 0) { //loops until menu is equal to something besides 0
            int userid = -1; //will be set to the valid user id
            int userinput = -1; //represents user input for choice select
            double doubleinput; //user input for dollar amounts
            while (userid == -1) {
                System.out.println("Enter account id: (number from 1 - 10) ");
                userid = input.nextInt();
                if ((userid > 9) || (userid < 0)) {
                    userid = -1;
                    System.out.println("Invalid account id");
                }
            }

            System.out.println("Welcome user #" + accounts[userid].getId() + "!");
            while (userinput != 4) { //repeats until user enters 4 to log out.. if statements inside to check against user input
                System.out.println("Enter 1 to view balance, enter 2 to withdraw funds, enter 3 to deposit funds, or enter 4 to log out");
                userinput = input.nextInt();
                if (userinput == 1) {
                    System.out.println("Current balance is " + accounts[userid].getBalance()); //uses getBalance method to display balance
                } else if (userinput == 2) {
                    System.out.println("Enter amount to withdraw: ");
                    doubleinput = input.nextDouble();
                    accounts[userid].withdraw(doubleinput);
                } //uses withdraw method and sends it user input
                else if (userinput == 3) {
                    System.out.println("Enter amount to deposit: ");
                    doubleinput = input.nextDouble();
                    accounts[userid].deposit(doubleinput);
                } //uses deposit method and sends it user input
                else if (userinput == 4) {
                    System.out.println("Logging out... have a great day!"); //displays log out message
                } else {
                    System.out.println("Invalid input, please enter 1, 2, 3 or 4");
                } //displays if invalid input
            }
        }

    }
}
