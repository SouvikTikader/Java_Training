import java.util.*;
public class calc {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number:");
      int x = sc.nextInt();
      System.out.println("Enter second number:");
      int y = sc.nextInt();
      System.out.println("Ebter the operator:");
      char c = sc.next().charAt(0);
      
      switch(c){
        case '+':
          System.out.println(x+y);
          break;
        case '-':
          System.out.println(x-y);
          break;
        case '/': 
          System.out.println(x*y);
          break;
        case '*':
          System.out.println(x/y);
          break;
        

      }

  }
}
