package ex01.task1;
import java.util.Scanner;
public class task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			double rez;
			rez = (Math.cos(x) / Math.PI - 2 * x) + 16 * x * Math.cos(x) * Math.cos(y) - 2;
			System.out.println(rez);
	}
    }
