package ex02;
import java.util.Scanner;
public class Task6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double R1 = sc.nextDouble();
double R2 = sc.nextDouble();
double R3 = sc.nextDouble();
double R0;
R0 = 1/R1 + 1/R2 + 1/R3;
System.out.print("Total Resistance");
System.out.println(R0);
	}
}