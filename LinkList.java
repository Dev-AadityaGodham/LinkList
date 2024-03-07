//first we created LL class
class LL {
  //declaration of Node head
    Node head;

  //the nested class Node having two paramerersString data and Node next;
    class Node {
        String data;
        Node next;
        //Node haing data and next 
        Node(String data) {
            this.data = data;
          //for every node next node is null
            this.next = null;
        }
    }
    //this will add new node to the net of existing node
    public void addFirst(String data) {
      //new node is object of node class
        Node newNode = new Node(data);
      //if head is null means there is no node the make new node a head
        if (head == null) {
            head = newNode;
            return;
        }
        
        newNode.next = head;
      //make newnode a head
        head = newNode;
    }
    //to add node to th last of the list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
      //to track the head we created currnode
        Node currNode = head;
      //if currentnode.next is not equelto null the make currNode to currNode.next
        while (currNode.next != null) {
            currNode = currNode.next;
        }
      
        currNode.next = newNode;
    }
    
    public void PrintList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.PrintList();
    }
}
