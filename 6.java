/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E6 {
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    float Mb;
	    float Kb;
	    System.out.println("Ingrese cantidad de Mb : "); //ingreso 3.5mb (el peso de una cancion en .mp3)
	    Mb = input.nextFloat();
	    Kb = 1000*Mb;
	    System.out.println("Cantidad de Kb: "+Kb ); //resultado: 3500.0
	    input.close();
	   

	}
}
