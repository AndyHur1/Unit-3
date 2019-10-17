import java.util.Scanner;

public class CourseRoom {
    public static void main(String[] args){
        /*Andy Hur*/
        /*10.16.2019*/
        /*Create a generator that will accept the name of the Course*/
        Scanner course_room = new Scanner(System.in);
        System.out.print("What is the description of the course? ");
        String course_full_name = course_room.nextLine();
        int space = ' ';
        int fromindex = 0;
        int index1 = course_full_name.indexOf(space, fromindex);
        fromindex = index1+1;
        int index2 = course_full_name.indexOf(space, fromindex);
        int length = course_full_name.length();
        System.out.println("Department: "+course_full_name.substring(0,index1));
        System.out.println("Course Number: "+course_full_name.substring(index1+1,index2));
        System.out.println("Title: "+course_full_name.substring(index2+1,length));

    }
}
