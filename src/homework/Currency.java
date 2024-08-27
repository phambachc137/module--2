package src.homework;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount of usd money: ");
         usd = sc.nextDouble();
         double change = usd*23000;
         System.out.println("USD change: " + change);

    }
}
