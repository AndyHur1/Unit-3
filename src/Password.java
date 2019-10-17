import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        /*Andy Hur*/
        /*10.16.2019*/
        /* Create a very basic password generator that will create a password based on a user’s name and age */
        Scanner password = new Scanner(System.in);

        /* Get the user's first, middle, last names and age*/
        System.out.print("First Name: ");
        String f_name = password.next();
        System.out.print("Middle Name: ");
        String m_name = password.next();
        System.out.print("Last Name: ");
        String l_name = password.next();
        System.out.print("Age: ");
        int age = password.nextInt();
        int f_length = f_name.length();
        int m_length = m_name.length();
        int l_length =l_name.length();
        int f_mid = f_length/2;
        int m_mid = m_length/2;
        int l_mid = l_length/2;
        int age_password = age*75;

        /* Get the  middle letters of first, middle, and last names */
        String name_1 = f_name.substring(f_mid,f_mid+1);
        String name_2 = m_name.substring(m_mid,m_mid+1);
        String name_3 = l_name.substring(l_mid,l_mid+1);
        String f_3_letters = name_1+name_2+name_3;

        /* Convert the middle letters to upper case*/
        String f_3_letters_u = f_3_letters.toUpperCase();

        /* Get the last letters of first, middle, and last names*/
        String name_4 = f_name.substring(f_length-1,f_length);
        String name_5 = m_name.substring(m_length-1,m_length);
        String name_6 = l_name.substring(l_length-1,l_length);
        String l_3_letters = name_4+name_5+name_6;

        System.out.println(f_3_letters_u+l_3_letters+age_password);



    }
}
