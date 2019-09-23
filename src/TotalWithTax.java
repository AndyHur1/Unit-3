import java.util.Scanner;

public class TotalWithTax {
    public static void main(String[] args)
    {
        final double TAXRATE;
        double price;
        double tax;
        double total;
        Scanner HEHEXD = new Scanner(System.in);
        TAXRATE = 0.0825;
        System.out.println("Please type price of goods");
        price =  HEHEXD.nextDouble();
        tax = price*TAXRATE;
        total = tax + price;
        System.out.println("Price: $"+(price));
        System.out.println("Sales Tax: $"+(tax));
        System.out.println("Total: $"+(total));

    }
}
