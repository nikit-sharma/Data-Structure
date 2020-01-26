
public class Solution {



	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
        
        
        LinkedListNode<Integer> start = head;
        LinkedListNode<Integer> bubble = start.next;
        while(start.next != null)
        {
            while(bubble != null)
            {
                if(start.data >= bubble.data)
                {
                    int temp = start.data;
                    start.data = bubble.data;
                    bubble.data = temp;
                }
                bubble = bubble.next;
            }
            start = start.next;
            bubble = start.next;
        }
        return head;
	}



}

    