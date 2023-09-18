/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E13 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, digitos = 0;
    
    System.out.print("Inserte un número entero (5 cifras como máximo): ");
    n = input.nextInt(); //ponemos un numero ya sea negativo y positivo, de 5 cifras como maximo (-4)
    
    if ( n < 10 ) {
      digitos = 1;
    }
    if (( n >= 10 ) && ( n < 100 )) {
      digitos = 2;
    }
    if (( n >= 100 ) && ( n < 1000 )) {
      digitos = 3;
    }
    if (( n >= 1000 ) && ( n < 10000 )) {
      digitos = 4;
    }
    if ( n >= 10000 ) {
      digitos = 5;
    }
    if (digitos == 1) {
      System.out.println("El número introducido tiene 1 dígito.");
    } else {
      System.out.println("El número introducido tiene " + digitos + " dígitos.");
    }
  }
}
