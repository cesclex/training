import java.util.Arrays;
import java.util.Scanner;

class OrdenarNombres{
    public static Scanner leer = new Scanner(System.in);
    public static void main (String[] arg){
        
        /*Ordenar Nombres*/
            
        String[] Nombres = new String[5];
        
        for(int i=0; i<5; i++){
            System.out.println("Nombre: ");
            Nombres[i]=leer.next();
        }

        System.out.println("\n Nombres Desordenados");        
        for (String Nombre : Nombres) {
            System.out.print(Nombre + " / ");
        }
        
        System.out.println("\n Nombres Ordenados");
        Arrays.sort(Nombres);
        for (String Nombre : Nombres) {
            System.out.print(Nombre + " / ");
        }

        System.out.println("\n");

    }
}