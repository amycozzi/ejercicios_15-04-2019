/*Ejercicio 2*/
import java.util.Scanner;

public class 2
{
    public static void main(String args[])
    {
        Scanner teclado=new Scanner(System.in);
        float nota1=0, nota2=0, nota3=0;
        float prom=0;
        char nom;
        int cant=0, i=0;
        System.out.print("Ingresar la cantidad de alumnos");
		cant=teclado.nextInt();
        for(int i = 1; i <= cant; i++)
        {
            System.out.print("Ingresar nombre");
            nom=teclado.nextChar(); 
            System.out.print("Ingresar nota 1");
            nota1=teclado.nextFloat(); 
            System.out.print("Ingresar nota 2");
            nota2=teclado.nextFloat(); 
            System.out.print("Ingresar nota 3");
            nota3=teclado.nextFloat();
            prom=(nota1+nota2+nota3)/3;
            System.out.print("El alumno es"+ nom +"y su promedio es"+ prom +"\n");
        }
    }
}