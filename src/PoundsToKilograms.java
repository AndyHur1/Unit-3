import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args)
    {
       double lbs;
       double kgs;
       Scanner scan = new Scanner(System.in);

       System.out.println("Please type total pound");
       lbs = scan.nextDouble();
       kgs = lbs/2.205;
       System.out.println((lbs)+" pounds = "+(kgs)+" kilograms");
    }
}
