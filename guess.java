import java.util.*;
public class guess {
  public static void main(String[] args) {
    Random random = new Random();
    int n = random.nextInt(100) + 1; 
    int u = 0; 
    

    Scanner scanner = new java.util.Scanner(System.in);

    while (u != n) {
      System.out.print("Enter your guess: ");
      u= scanner.nextInt();

      if (u < n) {
        System.out.println("less than.");
      } else if (u > n) {
        System.out.println("More than.");
      } else {
        System.out.println("Congratulations! You've guessed the number");
        break;
      }
    }
  
  }
}
