/*Ejercicio 1*/
import java.util.Scanner;

public class 1
{
    public static void main(String args[])
    {
        Scanner teclado=new Scanner(System.in);
        int num1=0, num2=0;
        int suma=0;
        int resta=0;
        int multi=0;
        int div=0; 
        System.out.print("Ingresar un numero");
		num1=teclado.nextInt();
        System.out.print("Ingresar otro numero");
        num2=teclado.nextInt();
		suma=num1+num2;
        resta=num1-num2;
        multi=num1*num2;
        div=num1/num2;
        System.out.print("La suma es"+ suma +"\n La resta es"+ resta +"\n La multiplicacion es"+ multi +"\n La division es"+ div + );
    }
}