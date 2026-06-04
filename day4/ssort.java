
public class ssort{
  public static void main(String args[]){
    
    int[] arr={1,4,3,7,5,0};
    int min=0;
    
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        if(arr[j]<arr[min]){
          min=j;
        }
      }
      System.out.print(arr[i]+" ");
      System.out.println(arr[min]);
      int temp=arr[i];
      arr[i]=arr[min];
      arr[min]=temp;

    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }

}
