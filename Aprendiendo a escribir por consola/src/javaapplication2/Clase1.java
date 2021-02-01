/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Scrappy Doo Coco
 */
public class Clase1 {
    private String nombre;
    private String pais;
    private String departamento;
    public Clase1(String nombre, String pais, String departamento)
    {
        this.nombre= nombre;
        this.pais=pais;
        this.departamento=departamento;
    }
    public void SALUDO(){
        System.out.println("Mi nombre es: "+this.nombre +"mi pais es: "+this.pais+" mi departamento es: "+this.departamento);
    }
    public String getnombre(){return nombre;}
    public String getpais(){return pais;}
    public String getdepartamento(){return departamento;}
}
