
package javaapplication1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    //Declaración de variables
        int num1;
        int num2;
        Scanner read;
        
        //Inicialización de varibles
        num1 = 0;
        read = new Scanner(System.in);
        
        System.out.println(":::::Programa para realizar la suma de dos números:::::");
        System.out.print("Digite el Primer número: ");
        try
        {
            num1 = read.nextInt();
            if(isNumber(String.valueOf(num1)))
            {
                System.out.print("Digite el Segundo número: ");
                num2 = read.nextInt();
                if(isNumber(String.valueOf(num2)))
                {
                    System.out.println("- La Suma es: " + String.valueOf(num1 + num2));
                }
            }
        }
        catch(InputMismatchException err)
        {
            System.out.print("No digitó números :/");
        }
        
    }
    
    private static Boolean isNumber(String val)
    {
        try
        {
            Integer.parseInt(val);
            return true;
        }
        catch(NumberFormatException nEx)
        {
            return false;
        }
    }
}

