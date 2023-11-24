import java.util.*;
public class q1{
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number for table");
        int number=num.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
}
