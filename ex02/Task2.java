package ex02;
import java.util.Scanner;
public class Task2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int R = sc.nextInt();
	double areaCircle;
	double circle;
	areaCircle =  2 * Math.PI * R;
	System.out.print("Area Circle ");
	System.out.println(areaCircle);
	circle = Math.PI * R * R;
	System.out.print("Circle ");
	System.out.print(circle);
}
}
