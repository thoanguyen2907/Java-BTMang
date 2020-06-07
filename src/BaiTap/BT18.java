package BaiTap;

import java.util.Scanner;

public class BT18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int n = nhapN(scan); 
		int a[] = nhapMang(scan, n); 
		xuatMang(a); 
		int b[] = thongKe(a); 
		giongNhau(a); 
		inSLN(a);
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
	public static int[] thongKe(int a[]) {
		int b[] = new int [a.length]; 
		for (int i = 0; i < a.length; i++) {
			b[i] = 0; 
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if(i > j) {
						break; 
					}  else {
						b[i]++; 
					}
					
				}
			}
		}
		return b; 
	}
	public static int maxB(int b[]) {
		int maxB = b[0]; 
		for (int i = 0; i < b.length; i++) {
			if(b[i] > maxB) {
				maxB = b[i];
			}
		}
		return maxB;
	}
	public static void inSLN(int a[]) {
		int b[] = thongKe(a);
		int maxB = maxB(b); 
		for (int i = 0; i < b.length; i++) {
			if(b[i] != 0 && b[i] == maxB) {
				System.out.println("Phan tu xuat hien nhieu nhat: " + a[i] + "[" + b[i]+ "]"+"\t"); 
			}
		}
	}
	public static void giongNhau(int a[]) {
		int b[] = thongKe(a); 
		boolean flag; 
		for (int i = 0; i < b.length; i++) {
			flag = true; 
			for (int j = 1; j < b.length; j++) {
				if (b[i] == b[j] && b[i]!= 0 && b[i] > 1) {	
					flag = false; 					
				}
		}
			if (!flag) {
				System.out.println("Phan tu xuat hien bang nhau : "+ a[i] + "[" + b[i]+ "]"+"\t"); 									
			}
		}
	}
}
