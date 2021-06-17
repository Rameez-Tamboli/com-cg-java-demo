package com.cg.demo.gc;

public class App {

	public static void main(String[] args) {

		App app = new App();
		App app2 = new App();
		App app3 = new App();

		app = null;
		app2 = app3;

		System.gc();
		System.out.println("End");
	}

	@Override
	public void finalize() {
		System.out.println("finalize called");
	}
}
