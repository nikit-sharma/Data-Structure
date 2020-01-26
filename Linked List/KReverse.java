import java.util.*;
public class Solution {
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        
        
        LinkedListNode<Integer> current = head;
        LinkedListNode<Integer> next = null;
        LinkedListNode<Integer> prev = null;
        int count=0;
        while(count < k && current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null)
        {
            head.next = kReverse(next,k);
        }
        return prev;
    }




}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
