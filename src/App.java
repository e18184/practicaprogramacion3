
import modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /* Pregunta 1 */
        /* 2 compañias */

        Compania c1 = new Compania("compañia 1", null);
        Compania c2 = new Compania("google", null);

        /* - cada compañia, respectivamente 3, 2 departamentos */

        Departamento d1 = new Departamento("departmento 1", c1, null, null);
        Departamento d2 = new Departamento("departmento 2", c1, null, null);
        Departamento d3 = new Departamento("departmento 3", c1, null, null);

        Departamento d4 = new Departamento("departmento 4", c2, null, null);
        Departamento d5 = new Departamento("departmento 5", c2, null, null);

        /*- cada departamento 3 a 5 empleados. tiempo completo y parcial  */
        /* empleado a tiempo completo etc */
        /* d1 */
        TiempoCompleto etc1 = new TiempoCompleto("123", "manuel", d1, new Departamento[] { d1 });
        TiempoCompleto etc2 = new TiempoCompleto("124", "Mario", d1, new Departamento[] { d1 });
        TiempoCompleto etc3 = new TiempoCompleto("125", "Marcos", d1, new Departamento[] { d1 });

        TiempoParcial etp1 = new TiempoParcial("126", "Mauro", d1, 5);
        TiempoParcial etp2 = new TiempoParcial("127", "Mauro", d1, 5);

        /* d2 */

        TiempoCompleto etc4 = new TiempoCompleto("133", "Maria", d2, new Departamento[] { d2 });
        TiempoCompleto etc5 = new TiempoCompleto("134", "Jose", d2, new Departamento[] { d2 });
        TiempoCompleto etc6 = new TiempoCompleto("135", "Eva", d2, new Departamento[] { d2 });

        TiempoParcial etp3 = new TiempoParcial("136", "Fania", d2, 5);
        TiempoParcial etp4 = new TiempoParcial("137", "Fausto", d2, 5);

        /* d3 */

        TiempoCompleto etc7 = new TiempoCompleto("143", "Dario", d3, new Departamento[] { d3 });
        TiempoCompleto etc8 = new TiempoCompleto("144", "Jose", d3, new Departamento[] { d3 });

        TiempoParcial etp5 = new TiempoParcial("146", "Fania", d3, 5);

        /* d4 */
        TiempoCompleto etc9 = new TiempoCompleto("143", "Dario", d4, new Departamento[] { d4 });

        TiempoParcial etp6 = new TiempoParcial("146", "Fania", d4, 5);
        TiempoParcial etp7 = new TiempoParcial("146", "Fania", d4, 5);

        /* d5 */
        TiempoCompleto etc10 = new TiempoCompleto("153", "Dario", d5, new Departamento[] { d5 });

        TiempoParcial etp8 = new TiempoParcial("156", "Fania", d5, 5);
        TiempoParcial etp9 = new TiempoParcial("156", "Fania", d5, 5);

        /*
         * Cuantos empleados tiene la compañia. Mostrar su permanencia tiempo completo y
         * tiempo parcial.
         * 
         * {}}
         */

        Compania[] vcompania = new Compania[] { c1, c2 };

        c1.setDepartamento(new Departamento[] { d1, d2, d3 });
        c2.setDepartamento(new Departamento[] { d4, d5 });

        d1.setEmpleado(new Empleado[] { etc1, etc2, etc3, etp1, etp2 });
        d2.setEmpleado(new Empleado[] { etc4, etc5, etc6, etp3, etp4 });
        d3.setEmpleado(new Empleado[] { etc7, etc8, etp5 });
        d4.setEmpleado(new Empleado[] { etc9, etp6, etp7 });
        d5.setEmpleado(new Empleado[] { etc10, etp8, etp9 });

        int empleadostiempocompleto = 0;
        int empleadostiempoparcial = 0;

        for (int i = 0; i < vcompania.length; i++) {
            if (vcompania[i].getNombre().equals("google")) {

                for (int j = 0; j < vcompania[i].getDepartamento().length; j++) {
                    for (int k = 0; k < vcompania[i].getDepartamento()[j].getEmpleado().length; k++) {
                        // (vcompania[i].getDepartamento()[j].getEmpleado()[k].getSexo()==0)
                        // (vcompania[i].getDepartamento()[j].getEmpleado()[k].getEdad()>65)
                        if ((vcompania[i].getDepartamento()[j].getEmpleado()[k]) instanceof TiempoParcial) {
                            TiempoParcial th = (TiempoParcial) (vcompania[i].getDepartamento()[j].getEmpleado()[k]);

                            System.out.println("compañia:" + vcompania[i].getNombre() + " dpto: " +
                                    vcompania[i].getDepartamento()[j].getNombre() + " " +
                                    " permanencia:" + th.getNroHoras() + " hrs");
                            empleadostiempocompleto++;
                        } else {
                            System.out.println("compañia:" + vcompania[i].getNombre() + " dpto: " +
                                    vcompania[i].getDepartamento()[j].getNombre() + " " +
                                    " permanencia: 8 hrs");
                            empleadostiempoparcial++;
                        }

                    }

                }
            }

        }
        System.out.println("Tienen a tiempo completo:" + empleadostiempocompleto + " tiempo horario:"
                + empleadostiempoparcial);

        /* Cuantos departamentos existen en cada compañia. */

        for (int i = 0; i < vcompania.length; i++) {

            System.out.println(
                    "departamentos:" + vcompania[i].getNombre() + " numero departamentos: "
                            + vcompania[i].getDepartamento().length);

        }
        /* Visualizar todas las compañias que tengan mas de 5 empleados */
        System.out.println("PREGUNTA CONTROL NUMERO 1");
        int contarempleados = 0;

        for (int i = 0; i < vcompania.length; i++) {
            // System.out.println(vcompania[i].getNombre());
            contarempleados = 0;
            if (vcompania[i].getDepartamento() != null) {
                for (int j = 0; j < vcompania[i].getDepartamento().length; j++) {
                    // System.out.println(vcompania[i].getDepartamento()[j].getNombre());
                    if (vcompania[i].getDepartamento()[j].getEmpleado() != null) {
                        for (int k = 0; k < vcompania[i].getDepartamento()[j].getEmpleado().length; k++) {
                            System.out.println("nombre comp:" + vcompania[i].getNombre() + "nombre dpto: "
                                    + vcompania[i].getDepartamento()[j].getNombre() + "emp:"
                                    + vcompania[i].getDepartamento()[j].getEmpleado()[k].getNombre());
                            contarempleados = contarempleados + 1;

                        }
                    }
                }
            }
            System.out.println("compañia" + vcompania[i].getNombre() + "numero emp:" + contarempleados);
            for (int ix = 0; ix < vcompania.length; ix++) {
                if (vcompania[ix].contarEmpleados() > 5)
                    // System.out.println(vcompania[i].getNombre());
                    contarempleados = 0;
                if (vcompania[ix].getDepartamento() != null) {
                    for (int jx = 0; jx < vcompania[ix].getDepartamento().length; jx++) {
                        // System.out.println(vcompania[i].getDepartamento()[j].getNombre());
                        if (vcompania[ix].getDepartamento()[jx].getEmpleado() != null) {
                            for (int k = 0; k < vcompania[i].getDepartamento()[jx].getEmpleado().length; k++) {
                                System.out.println("nombre comp:" + vcompania[ix].getNombre() + "nombre dpto: "
                                        + vcompania[ix].getDepartamento()[jx].getNombre() + "emp:"
                                        + vcompania[ix].getDepartamento()[jx].getEmpleado()[k].getNombre());
                                contarempleados = contarempleados + 1;

                            }
                        }
                    }
                }
                p1[] vectorp1 = new p1[] {};
                p1 vp1 = new p1();

                if (contarempleados > 5) {
                    vp1 = new p1();
                    vp1.setC(vcompania[i]);
                    vp1.setB(true);

                } else {
                    vp1 = new p1();
                    vp1.setC(vcompania[i]);
                    vp1.setB(false);

                }
                vectorp1[i] = vp1;

                for (int xi = 0; xi < vectorp1.length; xi++) {
                    // System.out.println(vcompania[i].getNombre());
                    if (vectorp1[xi].getB()) {
                        contarempleados = 0;
                        if (vcompania[xi].getDepartamento() != null) {
                            for (int xj = 0; xj < vcompania[xi].getDepartamento().length; xj++) {
                                // System.out.println(vcompania[i].getDepartamento()[j].getNombre());
                                if (vcompania[xi].getDepartamento()[xj].getEmpleado() != null) {
                                    for (int xk = 0; xk < vcompania[xi].getDepartamento()[xj]
                                            .getEmpleado().length; xk++) {
                                        System.out.println("nombre comp:" + vcompania[xi].getNombre() + "nombre dpto: "
                                                + vcompania[xi].getDepartamento()[xj].getNombre() + "emp:"
                                                + vcompania[xi].getDepartamento()[xj].getEmpleado()[xk].getNombre());
                                        contarempleados = contarempleados + 1;

                                    }
                                }

                            }

                        }

                    }
                }
            }
        }
    }
}