/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.Servicio;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej5_Serv {
 int contador = 0; // lo inicio afuera para evitar que vuelva a ser 0 en caso de excepciones.
 
 
    public void juego(int compu) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int numero = 0;
       
        System.out.println("---Juego---");
        System.out.println("ADIVINE EL NUMERO DE LA MAQUINA");
        do {

            System.out.println("Ingrese un numero");

            try {
                numero = leer.nextInt();
                
            } catch (Exception e) {
                // el unico error q conseguia era java.util.InputMismatchException
                System.out.println("Error. No ingreso un numero entero");
                System.out.println("Vuelva a intentarlo");
                // ahora vamos a sumar el contador 1 y vamos a volver al metodo de nuevo
                contador++;
                juego(compu);
            }
            
            if (numero > compu) {
                System.out.println("El numero que ingreso es mayor al numero secreto");
            }
            if (numero < compu) {
                System.out.println("El numero que ingreso es menor al numero secreto");
            }
            contador++; // aumenta de a 1, xq vuelve a intentarlo.

        } while (numero != compu);

        System.out.println("CORRECTO");
        System.out.println("El numero de la maquina era el: " + numero);
        System.out.println("La cantidad de intentos fueron: " + contador);
    }
}
