package com.srkr.linkedlists;

public class QueueDemo {

	public static void main(String[] args) {
		Queue queue = new Queue(5);

		if (queue.enqueue("Joe"))
			System.out.println(" \"Joe\" is Inserted");
		else
			System.out.println("Queue Full!");

		if (queue.enqueue("Jack"))
			System.out.println(" \"Jack\" is Inserted");
		else
			System.out.println("Queue Full!");

		if (queue.enqueue("Jim"))
			System.out.println(" \"Jim\" is Inserted");
		else
			System.out.println("Queue Full!");

		if (queue.enqueue("John"))
			System.out.println(" \"John\" is Inserted");
		else
			System.out.println("Queue Full!");

		if (queue.enqueue("Zain"))
			System.out.println(" \"Zain\" is Inserted");
		else
			System.out.println("Queue Full!");

		queue.display();

		String d1 = queue.dequeue();
		System.out.println("Deleted Data : " + d1);

		String d2 = queue.dequeue();
		System.out.println("Deleted Data : " + d2);

		String d3 = queue.dequeue();
		System.out.println("Deleted Data : " + d3);

		String d4 = queue.dequeue();
		System.out.println("Deleted Data : " + d4);

		String d5 = queue.dequeue();
		System.out.println("Deleted Data : " + d5);

		queue.display();  //Queue Empty
		
	
		if (queue.enqueue("Zeba"))
			System.out.println(" \"Zeba\" is Inserted");
		else
			System.out.println("Queue Full!");
		
		if (queue.enqueue("Zain"))
			System.out.println(" \"Zain\" is Inserted");
		else
			System.out.println("Queue Full!");
		
		if (queue.enqueue("Zain2"))
			System.out.println(" \"Zain2\" is Inserted");
		else
			System.out.println("Queue Full!");

		
		System.out.println("rear : "+queue.rear);
		System.out.println("front : "+queue.front);

		queue.display(); 
		
		queue.dequeue();
		
		queue.display();
	}

}
