import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner Keyboard = new Scanner(System.in);

    int num1 = 0, num2 =0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    System.out.println("Please enter the first whole number you would like to add.");
     num1 = Keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
     num2 = Keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add.");
     num3 = Keyboard.nextInt();

    System.out.println("Please enter the first decimal number you would like to add.");
     dub1 = Keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
     dub2 = Keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");
     dub3 = Keyboard.nextDouble();

    int sum = num1 + num2 + num3;
    double sum2 = dub1 + dub2 + dub3;


    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum);

    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sum2);
  }
}
