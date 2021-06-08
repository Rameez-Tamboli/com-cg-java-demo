package practice;
import java.util.Scanner;

public class arrey3 {
			static int [] getSorted(int[] arr , int r) {
			
			for(int i = 0 ; i < r ; i++) {
				StringBuffer st = new StringBuffer(String.valueOf(arr[i]));
				st.reverse();
				arr[i] = Integer.parseInt(String.valueOf(st));
			}
			
			return arr;
		}
		
		static int [] sortArray(int[] arr , int r) {
			int temp=0;
			for(int i = 0 ; i < r ; i++ ) {
				for(int j =i+1 ; j< r ; j++) {
					if(arr[i] < arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			return arr;
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range of array : ");
			int range = sc.nextInt();
			
			int[] arr1 = new int[range];
			
			for(int i = 0 ; i < range ; i++) {
				System.out.println("Enter array element no " + i);
				arr1[i]=sc.nextInt();
			}
			
			
			int[] j = getSorted(arr1 , range);
			System.out.println("Reversed digits of a array");
			for(int i = 0 ; i < range ; i++) {
				System.out.print(" "+ j[i]);
			}
			int[] k = sortArray(j , range);
			System.out.println("");
			System.out.println("Sorted Reversed array");
			for(int i = 0 ; i < range ; i++) {
				System.out.print(" "+ k[i]);
			}
		}
	
}
