import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor, al=0, ga=0, di=0;
		
		valor = sc.nextInt();
		
		while(valor != 4) {
			switch(valor) {
			case 1:
				al += 1;
				break;
			case 2:
				ga += 1;
				break;
			case 3:
				di += 1;
				break;
			}
			
			valor = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool = "+al);
		System.out.println("Gasolina = "+ga);
		System.out.println("Diesel = "+di);
		
		sc.close();
	}
}