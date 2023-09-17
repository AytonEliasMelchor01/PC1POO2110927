/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E9 {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int sueldoSemanal;
    int horasTrabajadas;

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    horasTrabajadas = input.nextInt(); //como ejemplo introduzco 45 horas
    
    if (horasTrabajadas <= 40) {
      sueldoSemanal = 12 * horasTrabajadas; //si trabaja hasta 40 hors recibe 12 soles por hora
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16); // pero si trabaja mas de 40 horas resibe 16 soles por hora extra
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " soles"); //el resultado el 560 soles
  }
}
