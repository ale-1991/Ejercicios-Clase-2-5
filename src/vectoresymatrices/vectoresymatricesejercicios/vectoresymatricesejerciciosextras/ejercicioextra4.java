/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package vectoresymatrices.vectoresymatricesejercicios.vectoresymatricesejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Alejandro Caro
 */
public class ejercicioextra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos = 10;
        int aprobados=0;
        int desaprobados=0;
        double suma = 0;
        double aux =0;
        double[] notasFinales = new double [alumnos];
        
        for (int i=0;i<alumnos;i++){
            System.out.println("Ingrese la nota del primer trabajo practico del alumno "+ (i+1) +".");
            int nota1 = sc.nextInt();
            System.out.println("Ingrese la nota del segundo trabajo practico del alumno "+ (i+1) +".");
            int nota2 = sc.nextInt();
            System.out.println("Ingrese la nota del primer integrador del alumno "+(i+1)+".");
            int nota3 = sc.nextInt();
            System.out.println("Ingrese la nota del segundo integrador del alumno "+(i+1)+".");
            int nota4 = sc.nextInt();
            double promedio = (nota1*0.1+nota2*0.15+nota3*0.25+nota4*0.50);
            
            System.out.println("***Promedio del alumno " +(i+1)+" :" +promedio+".***");
            if(promedio>=7){
                aprobados++;
            }else{
                desaprobados++;
            }
            notasFinales[i]= promedio;
            
        }
        System.out.println("---NOTAS FINALES---");
        for(int i=0;i<alumnos;i++){
            System.out.print("["+notasFinales[i]+"]");
        }
        System.out.println("");
        
        System.out.println("La cantidad de alumnos aprobados es de: " + aprobados+".");
        System.out.println("La cantidad de alumnos desaprobados es de: "+desaprobados+".");
 
    }
  
    
}
