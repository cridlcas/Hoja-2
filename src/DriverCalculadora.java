/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Prof: Douglas Barrios
 * Grupo:
 * Edwin Coronado
 * Cristian Castillo
 * Maria Fernanda Davila
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

 public class DriverCalculadora {
	
	 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a la calculadora post fix, elija una opcion\n1.Utilizar Calculadora con Stack\nUtilizar Calculadora con Listas\n");
		int o1=sc.nextInt();
		if(o1==1)//En caso que quiera utilizar Stacks
		{
			System.out.println("Elija 1\n");
		}
		else if(o1==2)
		{
			System.out.println("Elija el tipo de lista a utilizar");
			System.out.println("1.Simplemente encadenado\n2.Doblemente encadenado\n3.Circularmente encadenado\n");
			int o2=sc.nextInt();
			if(o2==2)
			{
			}
		}
		CalculadoraFactory cFactory=new CalculadoraFactory();
		Calculadora calcu =cFactory.getCalculadora(1);
		
		
		
		try
		{
			String datos = new String(Files.readAllBytes(Paths.get("datos.txt")));
			System.out.println(datos+"\n");
			calcu.setString(datos);
			calcu.meterVector();
		}
		catch (IOException e)
		{
			System.out.println("NO EXISTE ARCHIVO 'datos.txt'");
		}
		
		if(calcu.calcularVector()==true)
		{
			System.out.println("El resultado es:"+calcu.getResultado());
		}
		else if(calcu.calcularVector()==false)
			System.out.println("El formato del documento datos.txt es incorrecto, reviselo porfavor");
	}

}
