import java.util.Scanner;

public class UsingTheMathClass {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first temperature: ");
        int temp_1 = scan.nextInt();
        System.out.print("Enter the second temperature: ");
        int temp_2 = scan.nextInt();
        int temp_diff = Math.abs(temp_1-temp_2);
        System.out.println("The temperature changed "+temp_diff+" degrees.");
    }
}
