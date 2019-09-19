import java.util.Scanner;

public class AddOneTakeOne {

        public static void main(String[] args){


            int number_that_will_added_one_and_take_one;
            Scanner HAM = new Scanner(System.in);
            System.out.println("Please enter a number");
            number_that_will_added_one_and_take_one = HAM.nextInt();
            number_that_will_added_one_and_take_one--;


            System.out.print(number_that_will_added_one_and_take_one++ + " ");
            System.out.print(number_that_will_added_one_and_take_one++ + " ");
            System.out.print(number_that_will_added_one_and_take_one++ + " ");


        }

}
