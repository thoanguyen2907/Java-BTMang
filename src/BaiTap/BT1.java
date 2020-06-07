package BaiTap;

import java.util.Scanner;
import java.io.*;

public class BT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		int isPower3  = ktMang(a);
		System.out.println("Co phai la mang 3^k : " + isPower3);
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap n > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] nhapMang(Scanner scan, int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=");
			a[i] = Integer.parseInt(scan.nextLine());
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.println("\n");
	}
	public static boolean ktDang3k(int x) {
		if (x > 1) {
			if (1162261467 % x == 0) {
				return true; 
			} 
		}
		return false; 
}
	
	public static int ktMang(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (ktDang3k(a[i])) {
				return 1; 
			} 
		}
		return 0; 
	}
}