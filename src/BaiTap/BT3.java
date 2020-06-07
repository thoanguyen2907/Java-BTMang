package BaiTap;

import java.util.Scanner;

public class BT3 {
	final static int MIN = -1000;
    final static int MAX  = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int n = nhapN(scan); 
		int a[] = taoMang(n); 
		xuatMang(a); 
		lietKe(a,scan);
	}
	public static int nhapN(Scanner scan) {
		int n; 
		do {
			System.out.println("Nhập n > 0 và n là số chẵn :  "); 
			n = Integer.parseInt(scan.nextLine());
		}while(n < 1 || n%2 !=0); 
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
	public static boolean ktSoChan(int x) {
		boolean laSoChan; 
		if (x % 2 == 0) {
			laSoChan = true; 
		} else {
			laSoChan = false; 
		}
		return laSoChan; 
	}
	public static void lietKe(int a[], Scanner scan) {
		System.out.println("Vui long nhap X : "); 
		int x = Integer.parseInt(scan.nextLine());
		System.out.println("Vui long nhap Y : "); 
		int y = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= x && a[i] <= y) {
				if (ktSoChan(a[i])) {
					System.out.print(a[i] + "\t");
				}
			}
		}
	}

}
