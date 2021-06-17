package com.cg.demo.multi;

public class ThreadDemo extends Thread {

	public void printLoop() {
//		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
	}

	@Override
	public void run() {
		this.printLoop();
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadDemo obj = new ThreadDemo();
		ThreadDemo obj2 = new ThreadDemo();
		ThreadDemo obj3 = new ThreadDemo();
		obj.start();
//		obj.join();
//		System.out.println(obj.getName());
//		obj.setName("MyThread1");
//		System.out.println(obj.getName());
//		System.out.println(obj2.getName());
//		System.out.println(obj3.getName());
		obj.setPriority(9);
		obj2.setPriority(2);
		obj3.setPriority(7);
		System.out.println(obj.getPriority());
		System.out.println(obj2.getPriority());
		System.out.println(obj3.getPriority());
		obj2.start();
		obj3.start();
//		obj.printLoop();
//		obj2.printLoop();
//		obj3.printLoop();
	}
}