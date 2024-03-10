/******************************************************************************
LinkedListWithCollectionFramework
*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		//collection framework inbuild functions addFirst() to add new node to the first 
		list.addFirst("GoodAfterNoon");
		list.addFirst("Hello!");
		list.addLast("Aaditya");
		list.addLast("Godham");//even though u did not mention the last keyword still it will add to the end of the list
		System.out.println(list);
		//collection framework inbuild functions list.size() to calculate the size of the list 
		System.out.println("Size of the list is: "+list.size());
		
		for(int i=0;i<list.size();i++){
		    System.out.print(list.get(i)+"->");
		}
		System.out.println("null");
		
		//to find something in list
		for(int i=0;i<list.size();i++){
		    if(list.get(i)=="Aaditya"){
		        System.out.println("Aaditya found at index: "+ i);
		    }
		}
		//to remove first node from the lisr we use removeFirst() functions 
		list.removeFirst();
		System.out.println("List after deleting first node");
		System.out.println(list);
		
		//to remove first node from the lisr we use removeLast() functions
		list.removeLast();
		System.out.println("List after deleting last node");
		System.out.println(list);
		
		//if u want to remove any node from the list use remove(index);
		list.remove(1);
		System.out.println("List after deleting 1st index node");
		System.out.println(list);
		
		//if u want to find something and deleting tha node u can do this
		for(int i=0;i<list.size();i++){
		    if(list.get(i)=="GoodAfterNoon"){
		        list.remove(i);
		    }
		}
		System.out.println("List after deleting GoodAfterNoon ");
		System.out.println(list);
	}
}
/******************************************************************************
output
[Hello!, GoodAfterNoon, Aaditya, Godham]
Size of the list is: 4
Hello!->GoodAfterNoon->Aaditya->Godham->null
Aaditya found at index: 2
List after deleting first node
[GoodAfterNoon, Aaditya, Godham]
List after deleting last node
[GoodAfterNoon, Aaditya]
List after deleting 1st index node
[GoodAfterNoon]
List after deleting GoodAfterNoon 
[]
*******************************************************************************/

