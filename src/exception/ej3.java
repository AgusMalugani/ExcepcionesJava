/*
Defina una clase llamada DivisionNumero. 
En el método main utilice un Scanner para leer dos números en forma de cadena. 
A continuación, utilice el método parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. 
Por ultimo realizar una división con los dos numeros y mostrar el resultado.
 */
package exception;

import java.util.Scanner;


public class ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        // tengo que pedir que ingrese 2 numeros, 2 variables de String y convertirlos a int
        try{
        System.out.println("Ingrese dos numeros enteros");
        String num1 = leer.next();
        String num2 = leer.next();
        
        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        
        double div = numero1 / numero2;
        System.out.println("la division de " + numero1 + " y " + numero2 + " es = " +div);
        } catch(NumberFormatException e){
            
            System.out.println("Error. Posibles razones.");
            System.out.println("Ingreso una letra, no un numero");
            System.out.println("No es un numero entero");
            System.out.println("Fijese de no haber ingresado espacios.");
        } catch(ArithmeticException e){
            System.out.println("Error. No se puede dividir por 0");
        } finally {
            System.out.println("Se salio de try- catch");
        }
      
  //java.lang.NumberFormatException: For input string: "a"
  //java.lang.ArithmeticException
    }
    
}
