import java.util.Scanner;

public class RoundTenth
{
    public static void main(String[] args)
    {

     Scanner DUDE = new Scanner (System.in);
     System.out.println("Decimal Number?");
     double NUM_1 = DUDE.nextDouble();
     double NUM_2 = NUM_1 * 10;
     double NUM_3 = NUM_2 + 0.5;
     double NUM_4 = (int) NUM_3;
     double answer = NUM_4 / 10;

     System.out.println(NUM_1+" rounded to the nearest tenth is "+answer);









    }




}
