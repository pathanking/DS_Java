package com.srkr.ds;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {
	private static class Emp {
		Integer eId;
		String name;

		Emp(Integer eId, String name) {
			this.eId = eId;
			this.name = name;
		}

		public Integer geteId() {
			return eId;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return this.name;
		}
	}

	public static void main(String[] args) {
		PriorityQueue<Emp> queue = new PriorityQueue<>(Comparator.comparing(Emp::getName));

		queue.offer(new Emp(101, "John"));
		queue.offer(new Emp(202, "Zain"));
		queue.offer(new Emp(505, "Salman"));
		queue.offer(new Emp(303, "Sai"));
		queue.offer(new Emp(404, "Aamir"));
		queue.offer(new Emp(707, "Vijay"));
		queue.offer(new Emp(909, "Manish"));
		queue.offer(new Emp(808, "Karthik"));

		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.offer(new Emp(606, "Fani"));
		System.out.println(queue);
		
	}
}
