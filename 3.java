/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E3
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    float euros,equivalencia,pesetas;
	    System.out.println("Ingresa los euros a convertir: "); //ingreso la cantidad de euro (56)
	    euros = input.nextFloat();
	    System.out.println("Ingresa el valor de pesetas por euro: "); //hay 166.386 pesetas por euro actualmente
	    equivalencia = input.nextFloat();
	    pesetas = euros*equivalencia;
	    System.out.println("Euros convertidos a pesetas: "+pesetas); //resultado: 9317.616
	    input.close();
	   

	}
}
