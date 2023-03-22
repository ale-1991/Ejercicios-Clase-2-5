/*
Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a por @
e por #
i por $
o por %
u por *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package subprogramas;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio11 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase terminada en punto:");
        String palabra = sc.nextLine();
        
        if (!palabra.endsWith(".")) {
            System.out.println("Secuencia no terminada en punto");
            return;
        }
        
        
        String codificada = codificar(palabra);
        System.out.println("Palabra o frase codificada:");
        System.out.println(codificada);
    }
        
        
        
        
    public static String codificar(String palabra) {
        String resultado = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            switch (Character.toLowerCase(letra)) {
                case 'a':
                    resultado += "@";
                    break;
                case 'e':
                    resultado += "#";
                    break;
                case 'i':
                    resultado += "$";
                    break;
                case 'o':
                    resultado += "%";
                    break;
                case 'u':
                    resultado += "*";
                    break;
                default:
                    resultado += letra;
                    break;
            }
        }
        return resultado;
    }
}


