import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        Scanner graph = new Scanner(System.in);
        System.out.println("Enter the x coordinate of the first point:");
        int x_1 = graph.nextInt();
        System.out.println("Enter the y coordinate of the first point:");
        int y_1 = graph.nextInt();
        System.out.println("Enter the x coordinate of the second point:");
        int x_2 = graph.nextInt();
        System.out.println("Enter the y coordinate of the second point:");
        int y_2 = graph.nextInt();
        double distance_x = Math.pow(x_2-x_1,2);
        double distance_y = Math.pow(y_2-y_1,2);
        double distance = Math.sqrt(distance_x+distance_y);
        System.out.println("The distance between ("+x_1+","+y_1+") and ("+x_2+","+y_2+") is "+distance);
    }
}
