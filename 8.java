/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E8 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int hora;
    System.out.println("Introduzca una hora del día (0 - 23): "); 
    hora = input.nextInt();
    if ((hora>=6) && (hora <=12)){
        System.out.println("Buenos Días");
    }
    if ((hora>=13) && (hora <=20)){
        System.out.println("Buenas Tardes");
    }
    if (((hora>=21) && (hora <24))||((hora<=5) && (hora >=0))) {
        System.out.println("Buenas Noches");
    }
  }
  }

