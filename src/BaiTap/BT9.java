package BaiTap;

import java.util.Scanner;

public class BT9 {
	 final static int MIN = -1000;
	 final static int MAX  = 1000; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Nhập 1 số n : ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = taoMang(n); 
		xuatMang(a);
		int tbc = tinhTBCSoNguyenTo(a); 
		if (tbc == 0) {
			System.out.println("Không có số nguyên tố trong mảng"); 
		} else {
			System.out.println("Trung bình cộng các số nguyên tố : " + tbc); 
		}
		
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
	public static boolean laSoNguyenTo (int x) {
			for (int i = 2; i < x-1; i++) {
				if(x % i == 0) {
					return false; 
				}
			}
			if (x <= 1) return false; 
		
		return true; 
	}
	public static int tinhTBCSoNguyenTo(int a[]) {
		int tong = 0; 
		int dem = 0;  
		int tbc = 0; 
		for (int i = 0; i < a.length; i++) {
			if (laSoNguyenTo(a[i])) {
				tong += a[i];
				dem++; 
			}
		}
		if (dem != 0) {
			tbc = tong/dem; 
		}
		
		return tbc; 
	}
}
