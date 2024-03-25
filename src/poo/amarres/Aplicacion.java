package Ejercicio1;

import java.time.LocalDate;
import java.time.Month;
import java.util.GregorianCalendar;

public class Aplicacion {

    public static void main(String[] args) {

        Velero v = new Velero("1234AAA", 100, 2000, 4);
        Yate y = new Yate("9000CCC", 300, 2005, 1500, 5);

        Cliente luis = new Cliente("11111111A", "Luis");
        Amarre amarre1 = new Amarre("A1");
        amarre1.asignarBarco(v);
        Alquiler a1 = new Alquiler(luis, LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 5), amarre1, v);
        infoAlquiler(a1);
        System.out.println("Total a pagar: " + alquiler(a1));

        Cliente maria = new Cliente("22222222B", "María");
        Amarre amarre2 = new Amarre("B2");
        amarre2.asignarBarco(y);
        Alquiler a2 = new Alquiler(maria, LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 5), amarre2, y);
        infoAlquiler(a2);
        System.out.println("Total a pagar: " + alquiler(a2));

    }

    public static double alquiler(Alquiler a) {
        return a.totalAlquiler();
    }
    
    public static void infoAlquiler(Alquiler a){
        System.out.println("\nInformación del alquiler: \n" + a.toString());
    }
}
