import java.util.Scanner;

public class FindThePower {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scan.nextInt();
        double power = Math.pow(base,exponent);
        System.out.println(base+"^"+exponent+" = "+power);

    }
}
