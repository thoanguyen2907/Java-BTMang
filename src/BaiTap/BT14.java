package BaiTap;

import java.util.Scanner;

public class BT14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		a = xoaSoChinhPhuong(a); 
		xuatMang(a);
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
	public static boolean ktSoChinhPhuong(int x) {
		  	double  sq = Math.sqrt(x);
	       return ((sq - Math.floor(sq)) == 0);
	}
	public static int demSoChinhPhuong (int a[]) {
		int dem = 0; 
		for (int i = 0; i < a.length; i++) {
			if (ktSoChinhPhuong(a[i])) {
				dem++; 
			}
		}
		return dem; 
	}
	public static int[] xoaSoChinhPhuong (int a[]) {
		int dem = demSoChinhPhuong(a); 
		int b[] = new int[a.length - dem]; 
		int j =0; 
		for (int i =0; i < a.length;i++) {
			if (!ktSoChinhPhuong(a[i])) {
				b[j] = a[i]; 
				j++; 
			}
		}
		return b; 
	}
}
