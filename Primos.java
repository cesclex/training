package primos;

import java.util.Scanner;

public class Primos {

    private static boolean SonLetras(String Cadena) {
        Boolean letras = false;
        try {
            Integer.parseInt(Cadena);
            letras = true;
        } catch (NumberFormatException e) {
            letras = false;
        }
        return letras;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obtenerNumero = new Scanner(System.in);
        int contador = 0;
        String numero,continuar="S";
        while (continuar.equals("s")|| continuar.equals("S")) {
        System.out.println("Digite el numero");
        numero = obtenerNumero.nextLine();
       
            if (SonLetras(numero)) {
                for (int i = 1; i <= Integer.parseInt(numero); i++) {
                    if ((Integer.parseInt(numero) % i) == 0) {
                        contador++;
                    }
                }
                if (contador <= 2) {
                    System.out.println("El numero que digitó es un numero Primo");
                } else {
                    System.out.println("El numero no es Primo");
                }
                System.out.println("Desea Continuar (S=si, N=no)");
                continuar = obtenerNumero.nextLine();
            }else
            {
                System.out.println("Ingrese solo valores Numericos");
                
            }
        }

    }

}
