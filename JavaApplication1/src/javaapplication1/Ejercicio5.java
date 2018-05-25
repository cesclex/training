package javaapplication1;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Falle
 */
public class Ejercicio5 {
     private static boolean EvaluarValor(String cadena) {
        Boolean verificar;
        try {
            Integer.parseInt(cadena);
            verificar = true;
        } catch (NumberFormatException nfe) {
            verificar = false;
        }
        return verificar;
    }

    private static Boolean VerificarBisiesto(int anio) {
        Boolean verificar = false;
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            verificar = true;
        }
        return verificar;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opc = "S", Anio="";
        do {
            System.out.println("Digite el año a verificar");
            Anio = leer.nextLine();
            if (EvaluarValor(Anio)) {
                if (VerificarBisiesto(Integer.parseInt(Anio))) {
                    System.out.println("Año bisiesto");
                } else {
                    System.out.println("Año no bisiesto");
                }
                System.out.println("¿Desea comprobar otro año?");
                opc = leer.nextLine();
            } else {
                 System.out.println("Año invalido, por favor ingrese un valor expresado en números");
            }
        } while (opc.equals("S") || opc.equals("s"));
    }
}
