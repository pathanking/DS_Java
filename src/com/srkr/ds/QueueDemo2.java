package com.srkr.ds;

import java.util.Deque;
import java.util.LinkedList;

public class QueueDemo2 {
	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<>();
		queue.add("zain");
		queue.add("sam");
		queue.add("ayan");
		queue.add("harish");
		queue.add("lokesh");
		queue.add("abhi");

		queue.addFirst("babu");
		queue.addLast("raju");

		System.out.println(queue);
	}
}