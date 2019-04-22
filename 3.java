/*Ejercicio 3*/
import java.util.Scanner;

public class 3
{
    public static void main(String args[])
    {
        Scanner teclado=new Scanner(System.in);
        int horas=0, total=0;
        char nom;
        int cant=0, i=0;
        System.out.print("Ingresar la cantidad de empleados");
		cant=teclado.nextInt();
        for(int i = 1; i <= cant; i++)
        {
            System.out.print("Ingresar nombre");
            nom=teclado.nextChar(); 
            System.out.print("Ingresar horas trabajadas");
            nota1=teclado.nextInt(); 
            total=horas*400;
            System.out.print("El empleado "+ nom +"tendra de sueldo"+ total +"\n");
        }
    }
}