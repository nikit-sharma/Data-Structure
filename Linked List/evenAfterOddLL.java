
public class Solution {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> root) {

         LinkedListNode<Integer> eh=null;
         LinkedListNode<Integer> et=null;
        
         LinkedListNode<Integer> oh=null;
         LinkedListNode<Integer> ot=null;
        
        LinkedListNode<Integer> head = root;
        
        if(head.next==null||head==null)
        {
            return head;
        }
        
        while(head!=null)
        {
            if(head.data%2==0)
            {
                if(eh==null)
                {
                    eh=head;
                    et=head;
                }
                else
                { 
                    et.next=head;
                    et=et.next;
                }
                head=head.next;
                et.next=null;
            }
            else
            {
                if(oh==null)
                {
                    oh=head;
                    ot=head;
                }
                else
                {
                    ot.next=head;
                    ot=ot.next;
                }
                head=head.next;
                ot.next = null;
            }
            
        }
        
        if(oh==null)
            return eh;
        
        ot.next=eh;
        
        return oh;  
	}
}
