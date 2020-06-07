package BaiTap;

import java.util.Scanner;

public class BT6 {
	final static int MIN = -100;
	 final static int MAX  = 100; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Nhập 1 số n : ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = taoMang(n); 
		xuatMang(a); 
		int tong = tinhTongSoDuong(a); 
		System.out.println("Tong cua cac so duong trong mang : " + tong); 
	}
	public static int nhapN(Scanner scan) {
		int n; 
		do {
			System.out.println("Nhap n > 0  và n chẵn "); 
			n = Integer.parseInt(scan.nextLine());
		}while(n < 0 || n % 2 != 0); 
		return n; 	
	}
	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i =0; i < n; i++) {
			a[i]= MIN + (int)(Math.random() * ((MAX - MIN) + 1 )); 	
		}
		return a; 
	}
	public static void xuatMang(int a[]) {
		for (int item: a)
		{
			System.out.print(item +  "\t"); 
		}
		System.out.print("\n");}
	public static boolean laSoDuong(int x) {
		boolean laSoDuong= true; 
		if ( x >0) {
			laSoDuong = true; 
		} else {
			laSoDuong = false; 
		}
		return laSoDuong;	
	}
	public static int tinhTongSoDuong(int a[]) {
		int tong = 0; 
		for (int i = 0; i < a.length; i++) {
			if (laSoDuong(a[i])) {
				tong += a[i]; 
			}
		}
		return tong;
	}
}
