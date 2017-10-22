package ex01.task1;
import java.util.Scanner;
public class task3 {
	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 double x = sc.nextDouble();
 double y = sc.nextDouble();
 double rez;
 rez = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x) * Math.tan(y);
 System.out.println(rez);
		
	}
	}
