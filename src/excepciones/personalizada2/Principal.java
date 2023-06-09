package excepciones.personalizada2;

public class Principal {
    public static void main(String args[]) {
        int numerador = 0;
        int denominador = 0;
        int resultado;
        try {
            resultado = numerador / denominador;
            if (denominador == 0) {
                throw new Excepcion1("Denominador igual a cero \n no se puede dividir");
            }
            if (numerador == 0) {
                throw new Excepcion2("Numerador igual a cero \n no se puede dividir");

            }

        } catch (Excepcion1 e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch (Excepcion2 e) {
            System.out.println(e.getMessage());

        }

    }
}
