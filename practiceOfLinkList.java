/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class ll{
    node head;
    class node{
        String data;
        node next;
        node(String data){
        this.data = data;
        this.next=null;
    }
    }
    
    
    //add first
    public void addFirst(String data){
        node newNode = new node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
    //add last
    public void addLast(String data){
        node newNode = new node(data);
        if(head==null){
            head = newNode;
            return;
        }
        node currentNode = head;
        while(currentNode.next != null){
            currentNode=currentNode.next;
        }
        
        currentNode.next = newNode;
    }
    public boolean empty(){
        if(head == null){
            System.out.println("list is empty");
        }
        return true;
    }
    public void printList(){
        
        node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+"->");
            currentNode=currentNode.next;
        }
        if(!empty())
            System.out.print("null");
    }
}
public class Main
{
	public static void main(String[] args) {
		ll list = new ll();
		list.addFirst("Aaditya");
		list.addFirst("hello");
		list.addLast("Godham");
		list.printList();
	}
}
