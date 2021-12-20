package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        double S = 0.0;
        double p = 0.0;
        do {
          a = input.nextInt();
          b = input.nextInt();
          c = input.nextInt();
        if ( (a + b <= c) || (a + c <= b) || (c + b <= a) ) {
          System.out.println("Values are not correct!");
        } else  {
          p = (a + b + c)/2;
          S = Math.sqrt(p* (p - a) * (p - b) * (p - c));
          System.out.println("Area:" + S);
        }
          if (a == b && a == c) {
            System.out.println("Triangle: equilateral");
          } else if (a == b && a != c){
            System.out.println("Triangle: isosceles");
          } else if (a == c && a != b) {
            System.out.println("Triangle: isosceles");
          } else if (c == b && c != a) {
            System.out.println("Triangle: isosceles");
          } else {
            System.out.println("Triangle: scalene ");
          }
           
          
              
           



        }
         while (a > 0 && b > 0 && c > 0);
        
    }
}

        
        
    
 

