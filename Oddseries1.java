package demo;
import java.util.Scanner;

public class Oddseries1 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int count;
	        if (a % 2 == 0) {
	            count = a - 1;   
	        } else {
	            count = a;      
	        }
	        for (int i = 1; i <= count; i++) {
	            int value = 2 * i - 1; 
	            System.out.print(value);
	            if (i < count) {
	                System.out.print(", ");
	            }
	        }

	        sc.close();
	    }
	}
