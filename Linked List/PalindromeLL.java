
public class Solution {
    
    public static LinkedListNode check(LinkedListNode head, LinkedListNode slow)
  {
    if(head.next==null)
      return slow;
    else if(head.next.next==null)
    {  
      if(slow.data==slow.next.data)
        return slow.next;
      else 
        return null;
    }
    else
    {
      LinkedListNode temp = check(head.next.next,slow.next);
      if(temp==null)
        return null;
      else 
      {
        
        if(slow.data==temp.next.data)
          return temp.next;
        else 
          return null;
      }
    }
  }
    
	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
        if(head==null)
      return false;
    LinkedListNode slow = head;
    LinkedListNode temp = check(head,slow);
    if(temp==null)
      return false;
    else
      return true;
    }
}
