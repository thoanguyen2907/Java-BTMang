package BaiTap;

import java.util.Scanner;

public class BT11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(scan, n);
		xuatMang(a);
		int soLonNhat  = soLonNhat(a); 
		System.out.println("So lon Nhat : " + soLonNhat); 
		int countMax = countMax(a); 
		System.out.println("So lon Nhat Lap lai : " + countMax + " lan ");
		a = xoaSoLonNhat(a); 
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
	public static int soLonNhat(int a[]) {
		int soLonNhat = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > soLonNhat) {
				soLonNhat = a[i]; 
			}
		}
		return soLonNhat; 
	}
	public static int countMax(int a[]) {
		int soLonNhat = soLonNhat(a); 
		int count = 0; 
		for (int i = 0; i < a.length; i++) {
			if (a[i] ==soLonNhat) {
				count++; 
			}
		}
		return count; 
	}
	public static int[] xoaSoLonNhat (int a[]) {
		int dem = countMax(a); 
		int soLonNhat = soLonNhat(a); 
		if (dem > 0) {
			int tam[] = new int [a.length - dem];
			int j = 0; 
			for (int i = 0; i < a.length; i++) {
				if (a[i] != soLonNhat) {
					tam[j] = a[i]; 
					j++; 
				}
			}
			a = tam; 
		}	
		return a; 
	}
	}

