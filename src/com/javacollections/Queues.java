package com.javacollections;
import java.util.PriorityQueue;
import java.util.Queue;
public class Queues {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(10000);
		queue.add(200);
		queue.add(3500);

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
