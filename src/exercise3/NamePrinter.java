package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class NamePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = 0; i < str.length();i++){
          char symbol = str.charAt(i);
        System.out.println("* " + symbol + " *");
        }
    }
}