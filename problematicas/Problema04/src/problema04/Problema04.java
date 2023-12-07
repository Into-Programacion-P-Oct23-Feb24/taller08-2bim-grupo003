/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author LAB.ELECT
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int fil = 5;

        for (int i = 1; i <= fil; i++) {
            for (int f = 1; f <= i; f++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = fil - 1; i >= 1; i--) {
            for (int f = 1; f <= i; f++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
