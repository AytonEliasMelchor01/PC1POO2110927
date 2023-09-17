/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E4
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    float soles,equivalencia,euros;
	    System.out.println("Ingresa los soles a convertir: "); //ingreso la cantidad de soles (50)
	    soles = input.nextFloat();
	    System.out.println("Ingresa el valor del euro: "); //3.96 soles actualmente
	    equivalencia = input.nextFloat();
	    euros = soles/equivalencia;
	    System.out.println("soles convertidos a euros: "+euros); //resultado: 12.626263 
	    input.close();
	   

	}
}
