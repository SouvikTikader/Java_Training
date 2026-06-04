import java.util.*;
public class rsum {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n];
    for (int i=0;i<n ;i++){
      arr[i]= sc.nextInt();

    }
    int[] arr1= new int[n];
    int count =0;
    for (int i=0;i<arr.length;i++){
      count+= arr[i];
      arr1[i]=count;
    }
    for (int i=0;i<arr.length;i++){

      System.out.print(arr1[i]+"  ");
    }
    
  }
  
}
