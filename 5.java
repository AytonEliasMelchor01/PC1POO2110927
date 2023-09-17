/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E5
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int horas;
	    int salario;
	    System.out.println("Ingrese la cantidad de horas que trabajo esta semana: "); //ingreso 48 horas 
	    horas = input.nextInt();
	    salario = 12*horas;
	    System.out.println("le corresponde: "+salario+" euros"); //resultado: 576 euros
	    input.close();
	   

	}
}
