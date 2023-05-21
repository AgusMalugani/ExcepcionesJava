/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Usuario
 */
//class Uno {
//    private static int metodo() {
//int valor=0;
//try {
//valor = valor+1;
//valor = valor + Integer.parseInt ("42"); // modificar esto para ver con error.
//valor = valor +1;
//System.out.println("Valor final del try:" + valor) ; // el try me dara 44
//} catch (NumberFormatException e) {
//valor = valor + Integer.parseInt("42");
//System.out.println("Valor final del catch:" + valor); // si hay excepciones me dara elcatch 43
//} finally {
//valor = valor + 1;
//System.out.println("Valor final del finally: " + valor) ; // el finally de o no deo error se corre, asique 45 y si da error 44
//}
//valor = valor +1;
//System.out.println("Valor antes del return: " + valor) ; // retorna 46
//return valor;
//}


//class Dos {
//    
//private static int metodo() {
//int valor=0;
//try{
//valor = valor + 1;
//valor = valor + Integer.parseInt ("W");
//valor = valor + 1;
//System.out.println("Valor final del try: " + valor) ; // tira error
//} catch ( NumberFormatException e ) {
//valor = valor + Integer.parseInt ("42"); // me da 43
//System.out.println("Valor final del catch: " + valor) ;
//} finally {
//valor = valor + 1;
//System.out.println("Valor final del finally: " + valor) ; //44
//}
//valor = valor + 1;
//System.out.println("Valor antes del return: " + valor) ; // 45
//return valor;
//}


 class Tres{
    
private static int metodo( ) {
int valor=0;
try{
valor = valor + 1;
valor = valor + Integer.parseInt ("W");
valor = valor + 1;
System.out.println("Valor final del try: " + valor);
} catch(NumberFormatException e) {
valor = valor + Integer.parseInt ("W");
System.out.println("Valor final del catch: " + valor); // dara error xqotra vez intenta convertir una letra en numero
} finally{
valor = valor + 1;
System.out.println("Valor final del finally:" + valor); // 2
}
valor = valor + 1;
System.out.println("Valor antes del return: " + valor) ; // me va a retornar el error
return valor;
}




public static void main (String[] args) {
    
try {
System.out.println (metodo()) ;
}catch(Exception e) {
System.err.println("Excepcion en metodo() ") ;
e.printStackTrace();
}
}
}
