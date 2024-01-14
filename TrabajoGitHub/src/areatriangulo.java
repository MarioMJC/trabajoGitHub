import java.util.Scanner;

public class areatriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la base del triangulo: ");
		double base = scanner.nextInt();

		System.out.println("Ingrese la altura del triangulo: ");
		double altura = scanner.nextInt();

		double area = calcularArea(base, altura);

		System.out.println("El area del triangulo es: " + area);

	}

	public static double calcularArea(double lado1, double lado2) {
		double area = 0.5 * lado1 * lado2;
		return area;
	}

}
