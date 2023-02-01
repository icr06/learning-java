import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, horas;
		double valorHora, salario;
		
		System.out.printf("Digite o numero = ");
		numero = sc.nextInt();
		System.out.printf("Digite a qtd de horas trabalhadas = ");
		horas = sc.nextInt();
		System.out.printf("Digite o valor da hora = ");
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.printf("%nNUMBER = %d%n", numero);
		System.out.printf("SALARY = %.2f", salario);
		
		sc.close();
	}

}