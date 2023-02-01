import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, areaTR, areaC, areaTRA, areaQUA, areaR;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		areaTR = (a*c)/2;
		areaC = 3.14159 * Math.pow(c, 2);
		areaTRA = ((a+b)*c)/2;
		areaQUA = Math.pow(b, 2);
		areaR = a * b;
		
		System.out.printf("TRIANGULO = %.3f%n",areaTR);
		System.out.printf("CIRCULO = %.3f%n",areaC);
		System.out.printf("TRAPEZIO = %.3f%n",areaTRA);
		System.out.printf("QUADRADO = %.3f%n",areaQUA);
		System.out.printf("RETANGULO = %.3f",areaR);
		
		sc.close();
	}

}