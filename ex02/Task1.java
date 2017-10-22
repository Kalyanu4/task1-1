package ex02;
import java.util.Scanner;
public class Task1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int rebro = sc.nextInt();
	double odnaGran;
	double vesKub;
	double volume;
	
	volume = Math.pow(rebro, 3);
	System.out.print("Cube volume ");
	System.out.println(volume);
	vesKub = Math.pow(rebro, 6);
	System.out.print("Cube area ");
	System.out.println(vesKub);
	odnaGran = Math.pow(rebro, 2);
	System.out.print("Cube facet ");
	System.out.println(odnaGran);
}
}
