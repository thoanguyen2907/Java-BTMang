package BaiTap;

import java.util.Scanner;

public class BT5 {
	final static int MIN = -1000;
    final static int MAX  = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		lietKeSoDauTienChan(a); 
	}
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhap n > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
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
		for (int item : a) {
			System.out.print(item + "\t");
		}
		System.out.println("\n");
	}
	public static boolean ktSoDauTienChan(int x) {
		boolean laSoChan; 
		x = Math.abs(x); 
		while (x >= 10) {
			x /=10; 
		}
		if (x % 2 == 0) {
			laSoChan = true;  
		} else {
			laSoChan = false; 
		}
		return laSoChan;
	}	
	
	
	public static void lietKeSoDauTienChan(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (ktSoDauTienChan(a[i])) {
				System.out.print(a[i] + "\t");
			}
		}
	}
	}

