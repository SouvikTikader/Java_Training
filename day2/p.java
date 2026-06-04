public class p{
  public static int fac(int n){
    System.out.println(n);
    if (n==0){
      return 1;
    }
    return (fac(n-1));
    
  }
  public static int facj(int n){
    
    if (n==0){
      System.out.println(0);
      return 0;
      
    }
    System.out.println(n+facj(n-1));
    return 0;
  }

  
  public static void main(String[] args) {
      int y=fac(5);
      int z=facj(5);
      
  }
  
  
}
