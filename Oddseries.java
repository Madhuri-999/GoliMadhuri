package demo;
import java.util.*;
public class Oddseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int number = 1;
        for (int i = 1; i <= a; i++) {
            System.out.print(number);
            if (i < a) System.out.print(", ");
            number += 2;
        }

        sc.close();
    }
}
