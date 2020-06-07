package BaiTap;

import java.util.Scanner;

public class BT2 {
	 final static int MIN = -100;
	 final static int MAX  = 100; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Nhập 1 số n : ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = taoMang(n); 
		xuatMang(a);
		lietKe(a); 
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
		System.out.print("\n");
		}
	public static void lietKe(int a[]) {
		int i , j , kcgn = Math.abs(a[0] - a[1]); 
		for (i =0; i < a.length; i++) {
			for (j = i+1; j < a.length; j++) {
				if (Math.abs(a[i] - a[j]) < kcgn){
					kcgn = Math.abs(a[i] - a[j]); 
					System.out.println("Nhung cap gia tri gan nhau nhat : \n"); 
					for (i = 0; i <a.length; i++) {
						for (j = i +1; j < a.length; j++) {
							if (Math.abs(a[i] - a[j]) == kcgn) {
								System.out.println("\t (a["+i+"]"+",a["+j+"])"+" -( "+ a[i] + "," +a[j]+")"); 
							}
						}
					}
				}
			}
		}
	}
}
