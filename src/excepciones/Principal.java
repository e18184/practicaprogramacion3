package excepciones;

public class Principal {
	public static int numerador = 10;
	public static Integer denominador = 0;
	public static float division;

	public static void main(String args[]) {
		System.out.println("Antes de hacer la division");
		division = numerador / denominador;
		System.out.println("Despues de hacer la division");

	}
}
