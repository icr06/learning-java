import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double valor, total;
		
		valor = sc.nextDouble();
		
		if(valor <= 2000.00) {
			System.out.println("Isento");
		} else {
			if(valor >= 2000.01 && valor <= 3000.00) {
				total = (valor - 2000) * 0.08;
				System.out.println("R$ "+total);
			} else {
				if(valor >= 3000.01 && valor <= 4500.00) {
					total = (valor - 3000) * 0.18 + 1000.0 * 0.08;
					System.out.println("R$ "+total );
				} else {
					if(valor >= 4500.00) {
						total = (valor - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
						System.out.println("R$ "+total );
					}
				}
			}
		}
		
		sc.close();
	}
}