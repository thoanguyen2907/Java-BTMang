package BaiTap;

import java.util.Scanner;

public class BT4LKSoLe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		lietKeSoLe(a); 
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
	public static boolean ktrSoLe(int x) {
		x = Math.abs(x);
		int soBanDau = x; 
		int soDangTach; 
		boolean flag = true; 
			while (soBanDau > 0) {
				soDangTach = soBanDau % 10; 
				if (soDangTach % 2 !=0) {
					flag = true; 
					soBanDau /= 10; 
				} else {
					flag = false;
					break; 
				}		
			}
		
		return flag; 	
	}
	
	
	public static void lietKeSoLe(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (ktrSoLe(a[i])) {
				System.out.print(a[i] + "\t");
			}
		}
	}
}
