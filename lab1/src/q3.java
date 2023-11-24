import java.util.*;
public class q3 {
    public static void main(String[]args){
        Scanner number=new Scanner(System.in);
        System.out.println("Enter a number of which you want the sum:");
        int num=number.nextInt();
        int sum=0;
        for (;num>0;)
        {
            int digit=num%10;
            num=num/10;
            sum=sum+digit;
        }
        System.out.println("The sum will be : "+sum);
    }
}
