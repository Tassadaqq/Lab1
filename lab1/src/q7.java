import java.util.*;
public class q7
{
    public static void main(String[]args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter first digit");
        int digit1=input.nextInt();
        System.out.println("Enter second digit");
        int digit2=input.nextInt();
        System.out.println("Enter the digit corresponding to the operator you want to perform\n1.+\n2.-\n3.*\n4./");
        int digit3=input.nextInt();
        if (digit3==1) {
            System.out.println("Result is: "+(digit1+digit2));
        } else if (digit3==2) {
            System.out.println("Result is: "+(digit1-digit2));
        }else if (digit3==3) {
            System.out.println("Result is: "+(digit1*digit2));
        }else if (digit3==2) {
            System.out.println("Result is: "+(digit1/digit2));
        }else{
            System.out.println("Enter valid number corresponding to operator");
        }
    }
}
