package BaiTap;

import java.util.Scanner;

public class BT7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean hangChucLa5 = ktraHangChuc(252); 
//		System.out.println("Hang chuc la 5 : " + hangChucLa5); 
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		lietKeSoHangChuc(a); 
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
	public static boolean ktraHangChuc(int x) {
		boolean hangChucLa5;
		while (x >= 100) {
			x = x/10; 
			if (x < 100 && x > 10) {
				break; 
			}
		}
		if (x % 10 == 5) {
			hangChucLa5 = true; 
		} else {
			hangChucLa5 = false; 
		}
		return hangChucLa5; 
	}
	public static void lietKeSoHangChuc (int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (ktraHangChuc(a[i])) {
				System.out.print(a[i] + "\t");
			}
		}
	}
}
