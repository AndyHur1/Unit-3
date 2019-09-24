import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args){
        /*Andy Hur*/
        /*This program will give you changes with dollars, quarters, dimes, nickels, and pennies based on how much money you inserted*/
        Scanner DRINK = new Scanner(System.in);
        System.out.println("Please enter a whole number of cents");
        int total = DRINK.nextInt();
        int dollars = total / 100;
        /*100 cents = 1 dollar, which I divide total amount of cents with 100, in order to get how many dollars do I need for the change*/
        int quarters = (total % 100) / 25;
        /*25 cents = 1 quarters, which I divide remaining with 25, in order to get how many quarters do I need for the change */
        int dimes = ((total % 100) % 25) /10;
        /*10 cents = 1 dime, which I divide remaining with 10 in order to get how many dimes do I need for change*/
        int nickels = (((total % 100) % 25) %10) / 5;
        /*5 cents = 1nickel, which I divide remaining with 5 after you changed with dollars,quarters, and dimes.*/
        int pennies = ((((total % 100) % 25) %10) % 5) / 1;
        /*1 cent = 1 penny, which I divide remaining with 1 in order to get how many pennies do I need for change*/
        System.out.println("You have "+dollars+" dollars, "+quarters+" quarters, "+dimes+" dimes,"+nickels+" nickels, and "+pennies+" pennies");







    }


}
