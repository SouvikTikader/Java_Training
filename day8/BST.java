

//construct BST with the following elements: 
import java.util.*;
class Main {
    public static class tree{
        int val;
        tree left;
        tree right;
        
        tree(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static tree sorte(int[] arr){
        if(arr.length==0){
            return null;
        }
        
        int mid=arr.length/2;
        int[] left=Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid+1,arr.length);
        tree n = new tree(arr[mid]);
        n.left=sorte(left);
        n.right=sorte(right);
        return n;
    }
    public static tree cons(tree r,int x){
        if (r == null) {
            return new tree(x);
        }
        if (x<r.val){
            r.left=cons(r.left,x);
        }else {
            r.right=cons(r.right,x);
        }
        return r;
    }
    public static void inorder(tree r){
        if(r==null){
            return;
        }
        inorder(r.left);
        System.out.print(r.val+" ");
        inorder(r.right);
    }
    public static void preorder(tree r){
        if(r==null){
            return;
        }
        
        System.out.print(r.val+" ");
        inorder(r.left);
        inorder(r.right);
    }
    public static void postorder(tree r){
        if(r==null){
            return;
        }
        inorder(r.left);
        inorder(r.right);
        System.out.print(r.val+" ");
    }
    
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] arr = {34,75,59,15,89,46,2,63,28,96,52,80,10,73};
        Arrays.sort(arr);
        tree r = sorte(arr);
        cons(r,87);
        System.out.println("InOrder:");
        inorder(r);
        System.out.println(" ");
        System.out.println("PreOrder:");
        preorder(r);
        System.out.println(" ");
        System.out.println("PostOrder:");
        postorder(r);
        
    }
}