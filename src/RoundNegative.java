import java.util.Scanner;

public class RoundNegative {
    public static void main(String[] args){

        Double Num_1;
        int Num_2;
        Scanner SMH = new Scanner(System.in);
        System.out.println("Enter a negative decimal number");
        Num_1 = SMH.nextDouble();
        Num_2 = (int)(Num_1-0.5);
        System.out.println(Num_1+ " rounded to a whole number is "+Num_2);





    }

}

