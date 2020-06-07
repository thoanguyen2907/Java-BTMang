package BaiTap;

import java.util.Scanner;

public class BT15 {
	final static int MIN = -100;
	 final static int MAX  = 100; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Nhập 1 số n : ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = taoMang(n); 
		xuatMang(a);
		a = xoayMang(a, scan); 
		xuatMang(a);
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
	public static int[] xoayMang (int a[],Scanner scan) {
		int k ; 
		do {
			System.out.print("Vui long nhap k : ");
			k = Integer.parseInt(scan.nextLine());
		}while (k < 1); 
		k = k % a.length;
		for (int i = 0; i < k; i++) {
			int tam = a[a.length - 1]; 
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j-1];
			}
			a[0] = tam;
			
		}
		return a; 
	}

}
