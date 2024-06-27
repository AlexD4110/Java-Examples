

		import java.util.Collections;
		import java.util.PriorityQueue;
		import java.util.Queue;


public class Main {

	public static void main(String[] args) {
		
		
		
		public class Main {

		    public static void main(String[] args) {

		        // Priority Queue = A FIFO data structure that serves elements
		        //                  with the highest priorities first
		        //                  before elements with lower priority

		        // Creating a priority queue with reverse order (max heap)
		        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

		        // Adding elements to the queue
		        queue.offer(3.0);
		        queue.offer(2.5);
		        queue.offer(3.5);
		        queue.offer(4.0);
		        queue.offer(2.0);

		        // Polling and printing elements from the queue
		        // Elements will be printed in descending order
		        while (!queue.isEmpty()) {
		            System.out.println(queue.poll());
		        }
		    }
		}

		

	}

}
