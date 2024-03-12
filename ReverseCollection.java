/******************************************************************************
ReverseList
*******************************************************************************/
import java.util.*;

public class Main
{
    public static LinkedList<Integer> ReverseList(LinkedList<Integer> list){
        LinkedList<Integer> Newlist = new LinkedList<Integer>();
    for(int i=list.size()-1;i>=0;i--){
        Newlist.add(list.get(i));
    }
    return Newlist;
}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addFirst(2);
		list.addFirst(1);
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(6);
		System.out.println(list);
		System.out.print(ReverseList(list));
	}
}
