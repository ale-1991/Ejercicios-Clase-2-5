/*
 Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ejercicioextra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de Socio (A,B o C)");
        String socio = leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        double costo = leer.nextDouble();
        
        if("A".equals(socio)){
            System.out.println("El costo del tratamiento es "+ (costo -(costo*0.5)));
        } else if("B".equals(socio)){
            System.out.println("EL costo del tratamiento es "+ (costo-(costo*0.35)));
        } else if("C".equals(socio)){
            System.out.println("EL costo del tratamiento es "+ costo);
        }else{
            System.out.println("La letra ingresada es incorrecta.");
        }
    }
}
