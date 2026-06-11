import java.util.*;
public class arr {
  public static ArrayList<Integer> push(ArrayList<Integer> a,int b){
    a.add(b);
    System.out.println("Stack after pushing : "+ a);
    return (a);
  }
  public static ArrayList pop(ArrayList<Integer> a){
    a.remove(a.size()-1);
    System.out.println("Stack after popping: "+a);
    return(a);
  }
  public static int peek(ArrayList<Integer> a){
    System.out.println("Peeked = " + a.get(a.size()-1));
    return (a.get(a.size()-1));
  }
  
  public static void display(ArrayList<Integer> a){
    System.out.println("Displaying elements:");
    for (int i = a.size()-1; i >=0; i--) {
        System.out.println(a.get(i));
    }
  }
  public static ArrayList<Integer> equene(ArrayList<Integer> a,int b){
    a.add(b);
    System.out.println("Quene after pushing : "+ a);
    return (a);
  }
  public static ArrayList<Integer> dequene(ArrayList<Integer> a){
    a.remove(0);
    System.out.println("Quene after dequening : "+ a);
    return (a);
  }
  public static ArrayList<Integer> peek1(ArrayList<Integer> a){
    a.get(0);
    System.out.println("Peeking : "+ 0);
    return (a);
  }
  public static void display1(ArrayList<Integer> a){
    System.out.println("Displaying elements:");
    for (int i = a.size()-1; i >=0; i--) {
        System.out.print(a.get(i)+"->");
    }
  }

  public static void main(String[] args) {
      ArrayList<Integer> stacklist= new ArrayList<>();
      ArrayList<Integer> Quene = new ArrayList<>();
      display(stacklist);
      push(stacklist,45);
      push(stacklist,90);
      push(stacklist,99);
      push(stacklist,123);
      push(stacklist,900);

      display(stacklist);


      peek(stacklist);
      pop(stacklist);
      peek(stacklist);
      pop(stacklist);
      peek(stacklist);
      pop(stacklist);
      display(stacklist);

      equene(Quene, 10);
      equene(Quene, 20);
      equene(Quene, 30);
      equene(Quene, 40);
      display1(Quene);

      dequene(Quene);
      dequene(Quene);

      peek(Quene);
      display1(Quene);




      
  }
  
}
