/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Se crea la cadena acumuladora para que se pueda imprimir todos
        los restulados, luego el valor de cent cambia respecto a la ultima vuelta
        del ciclo repetitivo,para que aumente su valor de 4 en 4 y esto va a 
        ser impreso en el resultado final.
       */
        String cadena = "";
        for (int far = 20; far <= 100; far+=4){
            double cent; 
            cent = 5/9.0 * (far-32);
            cadena = String.format("%s%.2f\n",cadena,cent);
            
                    
        }
        System.out.printf("%s",cadena);
    }
    
}
