/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

import datos.Pasaje;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String destino = JOptionPane.showInputDialog("Digite c si el destino es Cartagena y s si es Santa Marta ");
       
       float valor;
       if (destino.equals("c")){
          valor = 45;
       } else {
           valor = 35;
        }
       
       Pasaje p = new Pasaje(valor, destino);
        System.out.println("El precio de este pasaje es " + p.Total());
        
    }
    
}
