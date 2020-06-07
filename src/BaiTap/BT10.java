package BaiTap;

import java.util.Scanner;

public class BT10 {
	 final static int MIN = -10;
	 final static int MAX  = 10; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Nhập 1 số n : ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = taoMang(n); 
		xuatMang(a);
		System.out.println("Vui lòng nhập giá trị X : "); 
		int x = Integer.parseInt(scan.nextLine());
		int tbc = TBC(a, x); 
		System.out.println("Giá trị trung bình cộng là  : " + tbc); 
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
	public static int TBC (int a[], int x) {
		int tong = 0; 
		int dem = 0; 
		int tbc = 0; 
		for (int i = 0; i < a.length; i ++) {
			if (a[i] > x) {
				tong += a[i]; 
				dem++; 
			}
		}
		tbc = (int) Math.floor(tong/dem); 
		return tbc; 
	}
}
