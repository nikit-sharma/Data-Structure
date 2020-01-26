
public class solution {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {

        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> pointer=head;
        
        
        int take=0;
        int skip=0;
        
        while(head!=null && take < M)
        {
            temp=pointer.next;
            take++;
            head=head.next;
        }
        
        
        while(head!=null && skip < N)
        {
            head=head.next;
            skip++;
        }
        
        head=temp;
        return temp;
        
        
        
	}
}
