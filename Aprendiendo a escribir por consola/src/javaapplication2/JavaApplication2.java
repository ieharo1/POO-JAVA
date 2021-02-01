/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Scrappy Doo Coco
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, pais, departamento;
        Scanner teclado= new Scanner(System.in );
        System.out.print("Ingrese su nombre completo: ");
        nombre=teclado.nextLine();
        System.out.print("Ingrese su pais: ");
        pais=teclado.nextLine();
        System.out.print("Ingrese su departamento: ");
        departamento=teclado.nextLine();
        
        Clase1 obj= new Clase1(nombre,pais,departamento);
        obj.SALUDO();
        
    }
    
};