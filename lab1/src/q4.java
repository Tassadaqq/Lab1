import java.util.*;
public class q4 {
    public static void main(String[]args){
        String [] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int number=78;
        while (number!=0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number for weekday");
            number = input.nextInt();
            if (number == 1) {
                System.out.println(days[0]);
            } else if (number == 2) {
                System.out.println(days[1]);
            } else if (number == 3) {
                System.out.println(days[2]);
            } else if (number == 4) {
                System.out.println(days[3]);
            } else if (number == 5) {
                System.out.println(days[4]);
            } else if (number == 6) {
                System.out.println(days[5]);
            } else if (number == 7) {
                System.out.println(days[6]);
            } else if (number==0) {
                System.out.println("Thank you for using");
            } else {
                System.out.println("Enter a valid number for weekday correspondence");
            }
        }
    }
}
