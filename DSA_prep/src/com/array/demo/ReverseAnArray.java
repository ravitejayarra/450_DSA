package com.array.demo;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("-----------------");
		
		int i = 0, j = n-1;
		
		while(j>i) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
			i++;
			j--;
		}
		
		for(int k=0;k<n;k++) {
			System.out.print(arr[k] + " ");
		}
		
	}

}
