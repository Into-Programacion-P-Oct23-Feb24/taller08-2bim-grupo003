/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        int limite = 10;
        for (int num = 30; num >= limite; num--){
            System.out.printf("%d-%d-%d-%d\n",num, num*2,num*3,
                    num*4);
        }
    }
    
}
