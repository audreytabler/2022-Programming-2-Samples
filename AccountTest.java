//Audrey Tabler
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Checking check = new Checking(1,150.0,100);
        Savings sav = new Savings(2,100);
        int userinput = -1;
        double doubleinput = -1.0;
        Account checkorsav = check;
        System.out.println("Currently logged into checking account");

        while (userinput != 5) { //repeats until user enters 4 to log out.. if statements inside to check against user input
            System.out.print("Enter 1 to view balance, enter 2 to withdraw funds, enter 3 to deposit funds, enter 4 to switch accounts or enter 5 to log out: ");
            userinput = input.nextInt();
            if (userinput == 1) {
                System.out.println("Current balance is $" + checkorsav.getBalance()); //uses getBalance method to display balance
            } else if (userinput == 2) {
                System.out.println("Enter amount to withdraw: ");
                doubleinput = input.nextDouble();
                checkorsav.withdraw(doubleinput);
            } //uses withdraw method and sends it user input
            else if (userinput == 3) {
                System.out.println("Enter amount to deposit: ");
                doubleinput = input.nextDouble();
                checkorsav.deposit(doubleinput);
            } //uses deposit method and sends it user input
            else if (userinput ==4){
                if (checkorsav == check){
                    System.out.println("Logging out of checking account... logging into savings account.");
                    checkorsav = sav;
                }
                else{
                    System.out.println("Logging out of savings account... logging into checking account.");
                    checkorsav = check;
                }
            }
            else if (userinput == 5) {
                System.out.println("Logging out... have a great day!"); //displays log out message
            } else {
                System.out.println("Invalid input, please enter 1, 2, 3 or 4");
            } //displays if invalid input
        }
    }
}
