package ex01.task1;
import java.util.Scanner;
public class task1 {
	public static void main(String[] args) {
		System.out.println("Enter a , b , c");
		Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
 double rez;

 rez = (b + Math.sqrt(Math.pow(b, 2)+ 4 * a * c)) / ( 2 * a );
 rez = rez - Math.pow(a, 3) * c + Math.pow(b, -2);
 System.out.println("Result = " +rez);
 
}
}
