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
public class CamposYPropiedades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //valor
        Persona persona1= new Persona();
        persona1.setNombre("Carlos");
        System.out.print(persona1.getNombre()+"\n");
        persona1.setSalarioMensual(1000);
        System.out.print("Salario Mensual: "+persona1.getSalarioMensual()+"\n");
        System.out.print("Salario Anual: " +persona1.getSalarioAnual()+"\n");
        
        //referencia
        CambiarNombre(persona1);
        System.out.print(persona1.getNombre());
            
    }
    public static void CambiarNombre(Persona persona){
        persona.setNombre("Claudia");
    }
    
}
