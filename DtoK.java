//Decimal to base k conversion
//This program converts a decimal number to a specified base (k) and displays the result.
//Time Complexity: O(log n) where n is the decimal number, as we are dividing the number by the base in each iteration.
//Space Complexity: O(log n) for storing the result in a StringBuilder, which can grow in size based on the number of digits in the base k representation.

import java.util.Scanner;

public class DtoK {
    

    public static String decimalToBaseK(int decimalNumber, int base) {
        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            sb.append(remainder);
            decimalNumber /= base;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        System.out.print("Enter the base (k): ");
        int base = sc.nextInt();

        String result = decimalToBaseK(decimalNumber, base);
        System.out.println("The number " + decimalNumber + " in base " + base + " is: " + result);
    }
}