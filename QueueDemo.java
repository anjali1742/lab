import java.util.*;
import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
		 PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        //Add elements to the Queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Elements in Queue:"+queue);
        //remove () method =>removes first element from the queue
        System.out.println("Element removed from the queue: "+queue.remove());
        //element() => returns head of the queue
        System.out.println("Head of the queue: "+queue.element());
        //poll () => removes and returns the head
        System.out.println("Poll():Returned Head of the queue: "+queue.poll());
        //returns head of the queue
        System.out.println("peek():Head of the queue: "+queue.peek());
        //print the contents of the Queue
        System.out.println("Final Queue:"+queue);
    }
}
