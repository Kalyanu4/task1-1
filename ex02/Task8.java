package ex02;
import java.util.Scanner;
public class Task8 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
double R, p, S;
p = (a + b + c) / 2;
R = (p-a)*Math.tan(a)/2;
S = Math.PI * Math.pow(((p-a) * Math.tan(a)/2),2);
System.out.print("Circle area ");
System.out.print(S);
}
}