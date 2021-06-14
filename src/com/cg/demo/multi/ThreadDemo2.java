package com.cg.demo.multi;

public class ThreadDemo2 implements Runnable {

	public void printLoop() { // bookMovieTickets()
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		this.printLoop();
	}

	public static void main(String[] args) {

		Thread obj = new Thread(new ThreadDemo2());
		Thread obj2 = new Thread(new ThreadDemo2());
		Thread obj3 = new Thread(new ThreadDemo2());

		obj.start();
		obj2.start();
		obj3.start();

// 		obj.printLoop();
//		obj2.printLoop();
//		obj3.printLoop();
	}
}