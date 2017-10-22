package ex01.task1;
import java.util.Scanner;
public class task4 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
double rez ;
rez = ((x + y)/(y + 1)) - ((x * y - 12)/(34 + x));
System.out.println(rez);
}
}