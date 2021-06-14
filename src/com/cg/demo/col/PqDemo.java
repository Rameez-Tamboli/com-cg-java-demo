package com.cg.demo.col;

import java.util.PriorityQueue;
import java.util.Queue;

public class PqDemo {

	public static void main(String[] args) {

//		Queue<Integer> queue = new PriorityQueue<Integer>();
		Queue<Integer> queue = new PriorityQueue<>();

		queue.add(10);
		queue.add(30);
		queue.add(20);
		queue.add(40);

		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue);

	}

}