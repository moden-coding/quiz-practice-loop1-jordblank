
/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        while ( true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            int remainder = number % 2;
            if (remainder == 0) {
                even++;
            } else {
                odd++;
            }
            
        }
        System.out.println("You entered " + even + " even numbers and " + odd + " odd numbers.");
    }
}
