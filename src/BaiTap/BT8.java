 package BaiTap;

import java.util.Scanner;

public class BT8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		int tong = tinhTong(a); 
		System.out.println("Tong la : " + tong); 
		
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
	public static int tinhTong(int a[]) {
		int tong = 0; 
		for (int i = 0; i < a.length -1; i++) {
			a[i+1] = Math.abs(a[i+1]); 
			if (a[i] > a[i+1]) {
				tong = tong + a[i]; 
			}
		}
		return tong; 
	}

}
