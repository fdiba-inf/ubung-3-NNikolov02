package exercise3;

import java.util.Scanner;

public class  AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double winkel = input.nextInt();
        char ch;
        double Radiant;
        double Grad;
        do {
          winkel = input.nextDouble();
          ch = input.next().charAt(0);
          if (ch == 'r') {
            Radiant = (winkel * 3.14) / 180;
            System.out.println("Angle" + Radiant + ch);
            } else { 
              Grad = (winkel * 180) / 3.14;
              System.out.println("Angle:" + Grad + ch);
            }
                 
            }
            while (ch == 'r' || ch == 'd');
        }
    }



