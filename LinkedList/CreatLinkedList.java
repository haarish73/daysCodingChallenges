public class CreatLinkedList {
     static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // 1. create new Node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        // 2.newNode next = head
        newNode.next = head;
        // 3. head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // 1. create a new Node
        Node newNode = new Node(data);


        // 2.tail.next = newNode
        tail.next= newNode;

        // 3. tail = newNode
        tail = newNode;
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

    public void addMidle(int data){
        
    }
    public static void main(String[] args) {
        CreatLinkedList ll = new CreatLinkedList();
        ll.print();
        ll.addFirst(3);
        ll.print(); 
        ll.addFirst(5);
        ll.print(); 
        ll.addLast(7);
        ll.print();
        ll.addLast(9);
        ll.print();
    }
}
