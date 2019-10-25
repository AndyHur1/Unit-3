import java.util.Scanner;

public class SquareRoot {
    /*Andy Hur*/
    /*10.16.2019*/
    public static void main(String[] args){
        Scanner word = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String square_root_word = word.nextLine();
        int number = square_root_word.length();
        double sqrt_number = Math.sqrt(number);
        int sqrt_number_1 = (int) Math.round(sqrt_number);
        String sqrt_word = square_root_word.substring(sqrt_number_1,sqrt_number_1+1);
        System.out.println("The \"Square Root\" of "+square_root_word+" is "+sqrt_word);

    }
}
