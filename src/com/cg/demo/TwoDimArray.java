package com.cg.demo;

public class TwoDimArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		arr[0][0] = 95;
		arr[0][1] = 85;
		arr[0][2] = 76;
		arr[1][0] = 58;
		arr[1][1] = 45;
		arr[1][2] = 48;
		arr[2][0] = 79;
		arr[2][1] = 62;
		arr[2][2] = 56;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}

	}
}