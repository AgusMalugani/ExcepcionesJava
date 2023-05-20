/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package exception;

public class ej2 {

 
    public static void main(String[] args) {

int [] numeros = {5,6,7,8,9}; // es un array de dim 5

//ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
try{
System.out.println("El numero que se encuentra en el indice 5 es : " + numeros[5]);
} catch(ArrayIndexOutOfBoundsException e){ // es una excepcion del error que me tira en la consola
    System.out.println("Recordemos que el array comienza en indice 0, asique tiene un indice hasta 4"); 
}

     

    }
    
}
