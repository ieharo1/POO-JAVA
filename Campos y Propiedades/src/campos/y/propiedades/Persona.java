/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campos.y.propiedades;

/**
 *
 * @author Scrappy Doo Coco
 */
public class Persona {
    private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    private int salariomensual;
    public int getSalarioMensual(){
        return salariomensual;
    }
    public void setSalarioMensual(int salariomensual){
        this.salariomensual=salariomensual;
    }
    public int getSalarioAnual(){
        return salariomensual*12;
    }
}
