package BaiTap;
import java.util.Scanner;

public class BT17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		int n = nhapN(scan); 
		int a[] = nhapMang(scan, n); 
		xuatMang(a); 
		a = xoayMangVong(a);
		xuatMang(a); 
	}
	public static int nhapN(Scanner scan) {
		int n; 
		do {
			System.out.println("Nhap n > 0 "); 
			n = Integer.parseInt(scan.nextLine());
		}while(n < 1); 
		return n; 
	}
	public static int[]  nhapMang(Scanner scan, int n) {
		int a[] = new int[n]; 
		for (int i = 0; i< n; i++) {
			System.out.println("a[" + i+ "]="); 
			a[i] = Integer.parseInt(scan.nextLine()); 
		}
		return a; 
	}
	public static void xuatMang(int a[]) {
		for (int item: a) {
			System.out.print(item +  "\t"); 
		}
		System.out.println("\n"); 
	}
	public static int[] xoayMangVong(int a[]) {
 
		int tam1 = a[0]; 
		int tam2 = a[1]; 
		for (int i = 0; i < a.length; i++) {
			a[i] = a[a.length -1 - i]; 
		}
		a[a.length -1] = tam1;
		a[a.length -2] = tam2; 
		return a; 
	}
}
