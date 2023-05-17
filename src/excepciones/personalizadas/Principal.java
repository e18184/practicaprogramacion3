package excepciones.personalizadas;

public class Principal {
    public static int dividir(int numerador, int denominador) throws DivisionporCero {
        if (denominador == 0) {
            throw new DivisionporCero("Introdujo un valor de cero");
        }
        return numerador / denominador;
    }

    public static void main(String args[]) {
        System.out.println(dividir(3, 3));

    }

}
