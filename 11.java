/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E11 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("A continuación deberá introducir una hora del día, ");
    System.out.println("primero introducirá la hora y luego los minutos.");
    
    System.out.print("hora: ");
    int hora = input.nextInt();
    
    System.out.print("minuto: ");
    int minuto = input.nextInt();

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
            
    //System.out.println("Desde las " + hora + ":" + minuto + " hasta la medianoche faltan " + segundosHastaMedianoche + " segundos.");
    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minuto, segundosHastaMedianoche);
  }
}