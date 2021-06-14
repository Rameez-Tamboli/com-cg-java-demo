package com.cg.Ex;

//class One {

//
//}
//
//class Two extends One {
//
//}
//
//class Three extends Two {
//
//}
//
//class Four extends Two {
//
//}

//{
//	if(color == green) {
//		throw new FakeCurrencyNoteException();
//	}
//}
//
//
//
class FakeCurrencyNoteException {

}

public class ThrowDemo {

	public static void checkEligibilty(int age) throws ArithmeticException {
		System.out.println("Some code ");
		if (age < 18) {
//			System.out.println("Can not vote.");
			throw new ArithmeticException("Can not vote.");
		} else {
			System.out.println("Vote for India.");
		}
	}

	public static void main(String args[]) {
		System.out.println("Election...");
		// here
		ThrowDemo.checkEligibilty(10);
	}
}