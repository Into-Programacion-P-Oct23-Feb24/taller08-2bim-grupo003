/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
    
        String nombre;
        String posicion;
        int edad;
        String lista = "Lista de jugadores\n";
        double estatura;
        int limite;
        System.out.println("Dijite la cantidad de jugadores que va a ingresar");
        limite = entrada.nextInt();
        for (int i = 1; i <= limite; i++) {
         entrada.nextLine();
        System.out.println("Ingrese el nombre del jugador");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la posicion del jugador");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la edad del jugador");
        edad = entrada.nextInt();
        System.out.println("Ingrese la estatura del jugador");
        estatura = entrada.nextDouble();
        lista = String.format("%s%d. %s -%s-, edad %d, estatura %2f\n", 
                lista,i,nombre,posicion,edad,estatura );
     }
        System.out.printf("%s", lista);
    }       
  
}
