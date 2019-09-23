import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args)
    {
        int length;
        int width;
        int area;
        Scanner overwatch = new Scanner(System.in);

        System.out.println("Please type the length of Rectangle");
        length = overwatch.nextInt();
        System.out.println("Please type the width of Rectangle");
        width = overwatch.nextInt();
        area = length*width;
        System.out.println("Area = "+(area));

    }
}
