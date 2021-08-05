package Queue_Interface;
import java.util.*;

public class PriorityQueueEx {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PriorityQueue<Integer> queue=new PriorityQueue<Integer>();  
			
			queue.add(100);
			queue.add(101);
			queue.add(102);
			queue.add(103);
			queue.add(104);
			
			System.out.println("Priority Queue : " +queue);
			System.out.println("First Element using queue.element(): " +queue.element());
			System.out.println("First Element using queue.peek(): " +queue.peek());
			System.out.println("Priority Queue : " +queue);
			queue.remove();
			System.out.println("Printing after removing Queue element using queue.remove() :" +queue);
			queue.remove();
			System.out.println("Printing after removing Queue element using queue.remove() :" +queue);
			queue.poll();
			System.out.println("Printing after removing Queue element using queue.poll() :" +queue);
			
			Iterator<Integer> i = queue.iterator();
			System.out.print("Printing queue with Iterator : ");
			while(i.hasNext()) {
				System.out.print(i.next()+ " ");
			}
		
		}

	}


