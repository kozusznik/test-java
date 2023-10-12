package kelvin.test_java;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
    	
    	new Thread().checkAccess(); 
    	Scanner sc = new Scanner(System.in);
        System.out.println("Hello World!");
        int sum = 0;
        while (sc.hasNextInt()) {
        	sum += sc.nextInt();
        }
        System.out.println("Sum: " + sum);
    }
}

