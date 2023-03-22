/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package javaintro01.ejerciciosestructurasdecontrol.ejerciciosextras;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra12 {
      public static void main(String[] args) {
    for (int i = 0; i <= 9; i++) {
      for (int j = 0; j <= 9; j++) {
        for (int k = 0; k <= 9; k++) {
          String numero = i + "-" + j + "-" + k;
          if (Integer.toString(k).equals("3")) {
            numero = numero.substring(0, numero.length() - 1) + "E";
          }
          System.out.println(numero);
        }
      }
    }
  }
}

/*
En este programa, utilizamos el método equals() para comparar el valor del dígito k con el valor "3". 
Para hacer la comparación, convertimos el valor de k a un objeto de tipo String utilizando 
el método Integer.toString(), y luego lo comparamos con la cadena "3".

Si el valor de k es igual a "3", utilizamos el método substring() para eliminar
el último carácter de la cadena numero (que sería el dígito "3") y lo reemplazamos con la letra "E".
*/