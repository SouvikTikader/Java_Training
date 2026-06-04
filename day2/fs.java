public class fs{
  public static int fac(int n){
    if(n==0){
      return 0;
    }else if(n==1){
      return 1;
    }else{
      return(fac(n-1)+fac(n-2));
    }
  }
  public static void main(String[] args) {
      int y=fac(5);
      System.out.println(y);
  }
  
  
}
