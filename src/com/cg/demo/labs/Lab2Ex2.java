package com.cg.demo.labs;

import java.util.Arrays;

public class Lab2Ex2 {

	public static String[] sortStrings(String[] arr) {
		System.out.println(" ");

		Arrays.sort(arr);

		for (int i = 0; i < arr.length / 2; i++) {
			System.out.println(arr[i].toUpperCase());
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			System.out.println(arr[i].toLowerCase());
		}
		return arr;

	}

	public static void main(String[] args) {

//		String[] str = { "Abc", "Zzz", "www", "aaa", "Vvv", "Ppp", "Sss" };
		String[] str = { "a", "Z", "w", "A", "V", "p", "s" };

		for (String s : Lab2Ex2.sortStrings(str)) {
			System.out.println(s);
		}

	}

}

//package com.cg.demo.Lab2;
//import java.util.*;
//public class Ex2 {
//    static String[] sortStrings(String[] arr)
//    {
//        
//           Arrays.sort(arr);
//           for(int i=0;i<arr.length/2;i++)
//           {
//              System.out.println(arr[i].toUpperCase());
//           }
//           for(int i=arr.length/2;i<arr.length;i++)
//           {
//         System.out.println(arr[i].toLowerCase());
//           }
//        return arr;
//    }
//    
//    
//    public static void main(String[] args) 
//    {
//         System.out.println("Enter size...");
//         Scanner s=new Scanner(System.in);
//         int size=s.nextInt();
//         String[] arr=new String[size];
//         for(int i=0;i<arr.length;i++)
//         {   
//           System.out.println("Enter alphabets...");
//           Scanner s2=new Scanner(System.in);
//           arr[i]=s2.next();
//          
//         } 
//         
//        for(int i=0;i<arr.length;i++)
//        {
//         System.out.println(arr[i]);
//        }  
//        System.out.println(sortStrings(arr));
//        
//    }
//
// 
//
//}
// 
//
//