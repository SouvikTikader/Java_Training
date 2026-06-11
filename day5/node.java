public class node {
  private Node head;
  static class  Node{
        int val;
        Node next;
        Node(int val){
          this.val=val;
          this.next=null;

        }

      }
  public void a(int data){
    Node newnode= new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    Node c =head;
    while(c.next==head){
      c=c.next;
    }
    c.next=newnode;


  }
  public void display() {
    Node current = head;
    
    System.out.print("Linked List: ");
    while (current != null) {
        System.out.print(current.val + " -> ");
        current = current.next; // Move to the next node
    }
    System.out.println("null");
  }
  public static void main(String[] args) {
      
      
      Node n1=new Node(10);
      Node n2=new Node(15);


  }
}
