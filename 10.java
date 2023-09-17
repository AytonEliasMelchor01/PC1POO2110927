/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class E9
{
	public static void main(String[] args) {
	    final double gravedad = 9.81; //definir la gravedad como una constante 
	    Scanner input = new Scanner (System.in);

	    System.out.println("Cálculo del tiempo que tarda en caer un objeto desde cierta altura ");
	    System.out.println("Ingrese la altura en metros: ");
	    double Altura = input.nextDouble(); //pedir ingresar altura en metros ( 30 metros)
	    
	    double Tiempo = Math.sqrt((2*Altura)/gravedad); //calcular usando la fórmula t = sqrt(2h/g)
		System.out.println("El tiempo que tarda en caer es: "+ Tiempo +" segundos"); //resultado 2.47 segundos
		
	}
}
