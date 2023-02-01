import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valor1, valor2;
		
		valor1 = sc.nextDouble();
		valor2 = sc.nextDouble();
		
		if(valor1 == 0 && valor2 == 0) {
			System.out.println("Origem");
		} else {
			if(valor1 > 0 && valor2 > 0) {
				System.out.println("Q1");
			} else {
				if(valor1 > 0 && valor2 < 0) {
					System.out.println("Q4");
				} else {
					if(valor1 < 0 && valor2 < 0) {
						System.out.println("Q3");
					} else {
						if(valor1 < 0 && valor2 > 0) {
							System.out.println("Q2");
						}
					}
				}
			}
		}
		
		sc.close();
	}
}