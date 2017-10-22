package ex02;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double x1, x2, d;
		if(a == 0) {
			System.out.println("Incorecct data");
			return;}
		d = b*b  -4 * a * c;
		d = Math.sqrt(d);
		x1 = (-b + d) /2 *a;
		x2 = (-b - d) /2 *a;
		System.out.println(x1);
		System.out.println(x2);
		
		
		}
	}
