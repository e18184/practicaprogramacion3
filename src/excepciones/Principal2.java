package excepciones;

public class Principal2 {
    public static int numerador = 10;
    public static Integer denominador = 0;
    public static float division;

    public static void main(String args[]) {
        System.out.println("Antes de hacer la division");
        try {
            division = numerador / denominador;
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("Despues de hacer la division");
        ;
    }
}
