import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c ,d, diferenca;
		
		System.out.printf("Valor 1 = ");
		a = sc.nextInt();
		System.out.printf("Valor 2 = ");
		b = sc.nextInt();
		System.out.printf("Valor 3 = ");
		c = sc.nextInt();
		System.out.printf("Valor 4 = ");
		d = sc.nextInt();
		
		diferenca = a*b - c*d;
		
		System.out.printf("A = %d",diferenca);
		
		sc.close();
	}

}