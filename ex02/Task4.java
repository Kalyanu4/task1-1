package ex02;
import java.util.Scanner;
public class Task4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int a=x;
double rez;
double rez1;
rez = -2 * a + 3 * Math.pow(x, 2) - 4 * Math.pow(x, 3);
rez1 = 1 + 2 * a + 3* Math.pow(x, 2) + 4 * Math.pow(x, 3);
System.out.println(rez);
System.out.println(rez1);
}
}