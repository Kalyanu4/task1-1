package ex02;
import java.util.Scanner;
public class Task3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int R = sc.nextInt();
	int r = sc.nextInt();	
	double area;
	if(R < r)
	{
		System.out.println("Incorrect data");
		return ;
	}
    area = Math.PI * (Math.pow(R, 2) - Math.pow(r, 2));
    System.out.print("Ring area ");
    System.out.print(area);
}
}
