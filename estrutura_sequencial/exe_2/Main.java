import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, area;
		
		System.out.printf("Digite o raio do circulo = ");
		a = sc.nextDouble();
		area = 3.14159 * Math.pow(a, 2);
		
		
		System.out.printf("A = %.4f",area);
		
		sc.close();
	}

}