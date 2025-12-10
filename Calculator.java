package demo;
import java.util.*;

public class Calculator {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a =sc.nextDouble();
        double b = sc.nextDouble();
        sc.nextLine();
        String s= sc.nextLine();
        
        if(s.equals("+")) {
        	System.out.println(a+b);
        	
        }
        else if(s.equals("-")) {
        	System.out.println(a-b);
        }
        else if(s.equals("*")) {
        	System.out.println(a*b);
        }
        else if (s.equals("/")) {
        	System.out.println(a/b);
        }
        else {
        	System.out.println("Invalid input provided.");
        }
        sc.close();      
    }
}


		



