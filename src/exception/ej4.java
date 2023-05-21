/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package exception;

import exception.Servicio.excepcionDiv;
import java.util.Scanner;

public class ej4{

    public static void main(String[] args) throws excepcionDiv {
       
               Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // tengo que pedir que ingrese 2 numeros, 2 variables de String y convertirlos a int
        try{
        System.out.println("Ingrese dos numeros enteros");
        String numerador = leer.next();
        String denominador = leer.next();
        
        
        int numero1 = Integer.parseInt(numerador);
 
        int numero2 = Integer.parseInt(denominador);
        
        if (numero2 == 0){
            throw new excepcionDiv("Error. No se puede dividir por 0");  
        }
        
        double div = numero1 / numero2;
        System.out.println("la division de " + numero1 + " y " + numero2 + " es = " +div);
        
        } catch(excepcionDiv e){
            System.out.println(e.getMessage());
          // throw(e);
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());        }
      
    }
    
}
