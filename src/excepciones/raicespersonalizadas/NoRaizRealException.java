package excepciones.raicespersonalizadas;

// representa la excepción: ecuación no tiene solución real
class NoRaizRealException extends Exception {
    private double a, b, c;

    public NoRaizRealException(String m, double a, double b, double c) {
        super(m);
        this.a = a;
        this.b = b;
        this.c = a;
    }

    public String getMessage() {
        return "Para los coeficientes " + (float) a + ", " +
                (float) b + ", " + (float) c + super.getMessage();
    }
}