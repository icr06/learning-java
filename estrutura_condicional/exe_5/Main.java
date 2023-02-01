import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double valor;
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		if(codigo == 1) {
			valor = qtd * 4.00;
		} else {
			if(codigo == 2) {
			 valor = qtd * 4.50;
			} else {
				if(codigo == 3) {
					valor = qtd * 5.00;
				} else {
					if(codigo == 4) {
						valor = qtd * 2.00;
					} else {
						valor = qtd * 1.50;
					}
				}
			}
		}
		
		System.out.println("TOTAL = R$ "+valor);
		
		sc.close();
	}

}