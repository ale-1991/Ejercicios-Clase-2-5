/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package subprogramas.ejerciciossubprogramas;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros que desea convertir");
        double euros = sc.nextDouble();
        
        System.out.print("Introduce la moneda a la que quieres convertir (GBP,USD o JPY): ");
        String moneda = sc.next();
        
        convertirMoneda(euros, moneda);
    }
    
    public static void convertirMoneda(double euros, String moneda){
        double cambio = 0.0;
        String divisa = "";
        
        switch(moneda.toUpperCase()) { //convierte en mayusculas
            case "USD":
                cambio = 1.28611;
                divisa = "dólares";
                break;
            case "JPY":
                cambio = 129.852;
                divisa = "yenes";
                break;
            case "GBP":
                cambio = 0.86;
                divisa = "libras";
                break;
            default:
                System.out.println("Moneda no soportada");
                return;
        }
        
        double resultado = euros * cambio;
        System.out.println(euros + " euros son " + resultado + " " + divisa);
    }
}
