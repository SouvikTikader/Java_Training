public class fact {
  public static int fac(int n){
    if(n<=1){
      return 1;
    }
    return(n*fac(n-1));
  }
  public static void main(String[] args) {
      int y=fac(5);
      System.out.println(y);
  }
  
  
}
