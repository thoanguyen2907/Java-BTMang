package BaiTap;

import java.util.Scanner;

public class BT13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		int demSoChan = demSoChan(a); 
		System.out.println("Dem cac so chan : " + demSoChan); 
		a = xoaSoChan(a); 
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
	public static int demSoChan(int a[]) {
		int dem = 0; 
		for (int i =0; i< a.length; i++) {
			if (a[i] % 2== 0) {
				dem++;
			}
		}
		return dem; 
	}
	public static int[] xoaSoChan(int a[]) {
		int demSoChan = demSoChan(a); 
		if (demSoChan > 0) {
			int tam[] = new int [a.length - demSoChan]; 
			int j =0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] % 2 != 0) {
					tam[j] = a[i]; 
					j++;
				}}
			a = tam;
		}
		else {
			System.out.println("khong co so chan trong mang");
		}
			return a;
	}
}
