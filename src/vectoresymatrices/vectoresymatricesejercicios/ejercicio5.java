/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package vectoresymatrices.vectoresymatricesejercicios;

/**
 *
 * @author Alejandro Caro
 */
import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrizA = new int[3][3];
        int [][] matrizB = new int [3][3];
        llenarmatriza(matrizA);
        llenarmatrizb(matrizB);
        
        boolean antisimetrica = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] != -matrizB[i][j]) {
                    antisimetrica = false;
                    break;
                }
            }
            if (!antisimetrica) {
                break;
            }
        }
        
        if (antisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }
    
    public static void llenarmatriza(int [][] matrizA){
        System.out.println("MATRIZ A");
        Scanner sc = new Scanner(System.in);
                for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese el valor del subindice [" + i + " ]" + ", ["+j+"]");
                matrizA[i][j]= sc.nextInt();
            }
        }
    }
    
    public static void llenarmatrizb(int [][] matrizB){
        System.out.println("MATRIZ B");
        Scanner sc = new Scanner(System.in);
                for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese el valor del subindice [" + i + " ]" + ", ["+j+"]");
                matrizB[i][j]= sc.nextInt();
            }
        }
    }

}
