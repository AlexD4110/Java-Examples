import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		
		// Queue = FIFO data structure. First-In First-Out
		//		   A collection designed for holding elemnts prior to processing
		//		   Linear data structure
		
		//			add 	= enqueue, offer()
		//			remove  = dequeue, poll()
		
		Queue<String> queue = new LinkedList<String>();
		
		
		queue.offer("Karen");
		queue.offer("Brad");
		queue.offer("Stevie");
		queue.offer("Alex");
		
		//System.out.println(queue.isEmpty());
		//System.out.println(queue.size());
		System.out.println(queue.contains("Alex"));
		
		
		
		
		//System.out.println(queue.peek());
		//queue.poll();
		//queue.poll();
		//queue.poll();
		//queue.poll();
		
		//System.out.println(queue);

		
		//"Bunch of People waiting in line" think of sixflags
		
		
		
	}

}
