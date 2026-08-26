public class ReverseLL {
    public class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
      newNode.next = head;
      head = newNode ;
    }
 public void print(){  //time complexity will be O(n)
        // here i am creating temp and in temp i am makeing temp = head
        Node temp = head;
        if(head == null){
            System.err.println("LinkedList is Empty");
            return;

        }
        while(temp != null){
            System.err.print(temp.data+ "->");
            temp = temp.next;
        }
        System.err.println();
    }

   public void reverseLll(){
    Node prev = null;
    Node curr = head;
    Node next;

    tail = head; // old head becomes new tail

    while(curr != null){
        next = curr.next;   // store next
        curr.next = prev;   // reverse link
        prev = curr;        // move prev forward
        curr = next;        // move curr forward
    }

    head = prev; // new head
}
    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.add(2);
        ll.add(4);
        ll.add(5);
        ll.add(7);
        ll.print();
        ll.reverseLll();
        ll.print();
    }
}
