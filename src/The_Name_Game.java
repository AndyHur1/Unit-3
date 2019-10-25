import java.util.Scanner;



public class The_Name_Game {


    private static String song(String name) {
        String songline;
        int length = name.length();
        String no_first = name.substring(1, length);
        String capital = name.toUpperCase();
        songline = name + " "+name + ", " + "bo-B"+no_first+"\nBanana=fana fo-F"+no_first+"\nFee-fi-mo-M"+no_first+"\n"+capital+"!";
    return songline;
    }

    public static void main(String[] args){
        Scanner name_game = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String f_name = name_game.nextLine();
        System.out.print("What is your last name? ");
        String l_name = name_game.nextLine();
        System.out.println(song(f_name));
        System.out.println(" ");
        System.out.println(song(l_name));



    }
}
