//first we created LL class
class LL {
  //declaration of Node head
    Node head;
    private int size;

  //the nested class Node having two paramerersString data and Node next;
    class Node {
        String data;
        Node next;
        //Node haing data and next 
        Node(String data) {
            this.data = data;
          //for every node next node is null
            this.next = null;
            size++;
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
    //PrintList function use to print the List
    public void PrintList() {
        //list ie empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        //to traverse the head we created new node named currNode
        Node currNode = head;
        //till currNode == null do currNode = currNode.next
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        //to print last node is null
        System.out.println("null");
    }
    //function to deleteFirst node in List
    public void deleteFirst(){
        //if the list list is empty the print empty list 
        if (head == null) {
            System.out.println("the List is empty");
            return;
        }
        size--;
        //if list have only one node the remove the node
        if(head.next==null){
            head=null;
            return;
        }
        //else do head = head.next //shift the node to the next node
        
        head = head.next;
    }
    //function to deleteLast node in List
    public void deleteLast(){
        //if the list list is empty the print empty list 
        if (head == null) {
            System.out.println("the List is empty");
            return;
        }
        size--;
        //if list have only one node the remove the node
        if(head.next==null){
            head=null;
            return;
        }
        //create two node first secondLast node which is to track head and scnd lastNode to track next node to the head Node
        Node secondLast = head;
        Node lastNode = head.next;
        
        //till lastNode.next == null do lastNode = lastNode.next and secondLast = secondLast.next
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        //do secondLast.empty = null //secondLast.next means last node of the list
        secondLast.next = null;
    }
    public int sizeOfList(){
        return size;
    }
}

public class Main {
    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a");//thsi will add 'a' to the first of the list
        list.addFirst("is");//this add 'is' to before 'a' 
        list.addLast("list");//thsi will add 'list' to the end of the list
        list.PrintList();//print the hole list
        list.deleteFirst();//will deleteFirst node which is 'is'
        list.PrintList();//print the list after deleting the first node
        list.deleteLast();//this will deleteLast node which is 'list'
        list.PrintList();//print the list after deleting the las node
        System.out.println(list.sizeOfList());
    }
}
