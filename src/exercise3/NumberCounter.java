package exercise3;

import java.util.Scanner;

public class NumberCounter {

public static void main(String [] args) {
  Scanner input= new Scanner(System.in);
  int number = input.nextInt();
  int positiveNumbers = 0;
  int negativeNumbers = 0;
  double sum = 0.0;
  double average = 0.0;
   
   while (number != 0 ) {
    number = input.nextInt();
    if (number > 0) {
      positiveNumbers++;
    }else{ 
      negativeNumbers++;
    }
    sum = sum + number;
    number = input.nextInt();
   }
     average = sum/(positiveNumbers + negativeNumbers);

    System.out.println("Positive numbers" + positiveNumbers);
    System.out.println("Negative numbers" + negativeNumbers);
    System.out.println("Sum" + sum);
    System.out.println("Average" + average);
   
}
}


