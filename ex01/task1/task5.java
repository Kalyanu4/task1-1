package ex01.task1;
import java.util.Scanner;
public class task5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
double rez;
rez = Math.sin(Math.sqrt(x+1)) - Math.sin(Math.sqrt(x-1));
System.out.println(rez);
}
}
