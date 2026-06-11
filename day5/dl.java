public class dl {
  
  public static void main(String[] args) {
      
    class node{
    int val;
    node next;
    node prev;
    node(int val){
      this.val=val;
      this.next=null;
      this.prev=null;
    }
    node n=new node(4);

  }
  class DoublyLinkedList{
    node head;
    public void in(int x){
      node n= new node(x);
      n.next=head;
      head.prev=n;
      head=n;
    }

    public node end(int x){
      node n=new node (x);
      if (head==null){
        return n;
      }
       while(head.next!=null){
        head=head.next;

      }
      node temp=head.next;
      head.next=n;
      n.prev=temp;
      return head;

    }
    public node mid(int x,int p){
      node  n=new node(x);

      if (p==1){
        head.prev=n;
        n.next=head;
        return n;

      }
      for(int i=1;i<p-1;i++){
        head=head.next;
      }
      n.next=head.next;
      n.prev=head;
      head.next=n;
      head.prev=n;
      
      return head;
    }

  }
  }
  
}
