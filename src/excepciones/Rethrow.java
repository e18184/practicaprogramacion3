package excepciones;

class Rethrow {
    public static void genExc(String args[]) {
    // Aquí, numer es más grande que denom.
    int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
    int denom[] = { 2, 0, 4, 4, 0, 8 };
    for(int i=0; i<numer.length; i++) {
    try {
    System.out.println(numer[i] + “ / “ +
    denom[i] + “ es “ +
    numer[i]/denom[i]);
    }
    catch (ArithmeticException exc) {
    // captura la excepción
    System.out.println(“¡No puede dividir entre cero!”);
    }
    catch (ArrayIndexOutOfBoundsException exc) {
    // captura la excepción
    System.out.println(“No hay elemento coincidente.”);
    throw exc; // relanza la excepción
    }
    } Relanza la excepción.
    }
}