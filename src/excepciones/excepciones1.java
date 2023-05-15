package excepciones;

public class excepciones1 {
    public static int convertir(String dato) throws NumberFormatException {

        int convertido = 0;
        convertido = Integer.parseInt(dato);
        return convertido;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int c = convertir("cien");
        System.out.println(c);

    }

}
