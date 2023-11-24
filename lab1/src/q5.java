import java.util.*;
public class q5
{
    public static void main(String[] args)
    {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 || (i == height / 2 && j <= height / 2) || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            for (int j = 0; j < height; j++) {
                if (i == 0 || (i == height / 2 && j == height / 2) || (j == 0 && i > 0) || (j == height - 1 && i > 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // Letter "S"
            for (int j = 0; j < height; j++) {
                if ((i == 0 || i == height / 2 || i == height - 1) || (i < height / 2 && j == 0) || (i > height / 2 && j == height - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // Letter "T"
            for (int j = 0; j < height; j++) {
                if (i == 0 || j == height / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}