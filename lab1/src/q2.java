import java.util.*;
public class q2{
    public static void main (String[] args){
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a digit to convert in farenheit");
        float number =num.nextFloat();
        System.out.println("Temperature in celsius will be "+((number-32)*(0.5555555555)));
    }
}
