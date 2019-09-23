import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        System.out.println("Please type Fahrenheit temperature");
        fahrenheit = scan.nextDouble();
        celsius = (fahrenheit - 32)*(5.0/9.0);
        System.out.println((fahrenheit)+" Fahrenheit = "+(celsius)+" Celsius");
    }
}
