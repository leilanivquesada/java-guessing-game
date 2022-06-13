/** A number guessing game. */
import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    Scanner input = new Scanner(System.in);

    // Get user's name
    System.out.println("Enter your name");
    String name = input.nextLine();
    System.out.println(name+", I'm thinking of a number between 0 and 100.");

    Random rand = new Random();

    int number = rand.nextInt(101);
    
    System.out.println("Try to guess the number");
    System.out.println("Enter your guess:");
    int guess = input.nextInt();
    int counter = 1;
    while (guess != number){
      if (guess < number) {
        System.out.println("Your guess is too low, try again.");
      } else {
        System.out.println("Your guess is too high, try again.");
      }
      counter = counter + 1;
      guess = input.nextInt();
      }
    if (guess == number) {
      System.out.println("Well done, " + name + "! You found my number in " + counter + " tries!");
    }
  }
}
