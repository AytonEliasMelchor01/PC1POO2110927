/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E7 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    float nota1, nota2, notaFinal;
    System.out.print("Introduzca la nota del primer examen: ");
    nota1 = input.nextFloat(); //supongamos que saque 7
    System.out.print("¿Qué nota quiere sacar en el trimestre? ");
    notaFinal = input.nextFloat(); //y quiero un 10 para el final 
    
    // La nota final se calcula de esta forma:
    // notaFinal = ((nota1 * 40) + (nota2 * 60)) / 100
    // Por tanto, despejando nota2 tenemos:
    // nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60
    nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60; // tendria que sacar un 12 en el segundo examen
    
    System.out.println("Para tener un " + notaFinal + " en el trimestre"); 
    System.out.println(" necesita sacar un " + nota2 + " en el segundo examen.");
  }
}
