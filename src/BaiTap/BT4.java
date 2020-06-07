package BaiTap;

import java.util.Scanner;

public class BT4 {
	final static int MIN = -1000;
    final static int MAX  = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in); 
	int n = nhapN(scan); 
	int a[] = taoMang(n); 
	xuatMang(a); 
	lietKe(a);
		
	}
	public static int nhapN(Scanner scan) {
		int n; 
		do {
			System.out.println("Nhập n > 0:  "); 
			n = Integer.parseInt(scan.nextLine());
		}while(n < 1); 
		return n; 
	}
	public static int[] taoMang(int n) {
        int a[] = new int[n];
        for (int i =0; i < n; i++) {
            a[i] = MIN + (int)(Math.random() * ((MAX - MIN) + 1 ));
        }
        return a;
    }
	public static void xuatMang(int a[]) {
		for (int item: a) {
			System.out.print(item +  "\t"); 
		}
		System.out.println("\n"); 
	}
	public static boolean ktSoLe(int x) {
		if(x % 2 != 0) {
			return true; 
		} else {
			return false; 
		}
	}
	public static void lietKe(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] %2!=0) {
				System.out.print(a[i]+"\t");
			}
		}
	}
	
}
