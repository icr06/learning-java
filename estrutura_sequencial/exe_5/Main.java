import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo1, qtdPecas1, codigo2, qtdPecas2;
		double valor1, valor2, soma;
		
		codigo1 = sc.nextInt();
		qtdPecas1 = sc.nextInt();
		valor1 = sc.nextDouble();
		codigo2 = sc.nextInt();
		qtdPecas2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		soma = (valor1*qtdPecas1) + (valor2*qtdPecas2);
		
		System.out.printf("VALOR A PAGAR = %.2f", soma);
		
		sc.close();
	}

}