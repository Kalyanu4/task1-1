package ex01.task1;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int d = sc.nextInt();
double rez;
rez = ((a/c)*(b/d))-((a*b-c)/(c*d));
System.out.println("Result = " +rez);
}
}