package excepciones;

public class Principal3 {

	public static int numerador = 4;
	public static Integer denominador = 0;
	public static float resultado;
	public static String[] s = new String[5];

	public static void main(String args[]) {

		try {

			resultado = numerador / denominador;
			s[3] = "MiDato";
		} catch (ArithmeticException e) {
			// excepcion
			// System.out.println(e.getMessage());
			System.out.println("Se dio una indeterminacion division por 0");
		} catch (NullPointerException e) {
			System.out.println("No se introdujo un valor");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Usted accedio a una posicion no definida \n en el vector");
		}

		finally {
			// si o si se ejecuta
			System.out.println("resultado:" + resultado);
			System.out.println("valor del vector:" + s[3]);

		}

	}

}
