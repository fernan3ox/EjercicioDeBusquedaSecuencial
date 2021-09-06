/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodebusquedasecuencial;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author Fernandito
 */
public class EjercicioDeBusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Persona> Personas =new ArrayList<>();
        int opcion=0;
        
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Menu \n 1.Buscar id \n2.Agregar una Persona \n3.Eliminar una Persona \n 4.Mostrar todas las personas \n5.Salir"));
            switch (opcion){
                
                case 1:
                    
                    String Id=JOptionPane.showInputDialog(null, "Escribir la id a buscar");
                    for (int i = 0; i < Personas.size(); i++) {
                        
                        if (Personas.get(i).getId().equals(Id)){
                            
                          
                            JOptionPane.showMessageDialog(null,"Persona encontrada!"
                        + "\nIdentificacion: "+Personas.get(i).getId()+
                        "\nNombre: "+Personas.get(i).getNombre()+"\nEdad: "+ Personas.get(i).getEdad());
                            
                            
                        }
                    }
                    
                    break;
                    
                case 2:
                    
                    String ID=JOptionPane.showInputDialog(null,"Escriba la Identificacion");
                    String NOMBRE=JOptionPane.showInputDialog(null, "Escriba el nombre");
                    int EDAD=Integer.parseInt(JOptionPane.showInputDialog(null, "Escriba la edad"));
                    Personas.add(new Persona( ID, NOMBRE,EDAD));
                    JOptionPane.showMessageDialog(null, "Persona agregada con exito!");
                    break;
                
                case 3:
                    Personas.remove(0);
                    JOptionPane.showMessageDialog(null, "Persona removida con exito!");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, imprimirLista(Personas));
                    
                    break;
                case 5:
                    
                  JOptionPane.showMessageDialog(null, "programa finalizado");
                    
                    break;
                    
                default:
                    
                
                
                
                
                
            }
            
        }while(opcion!=5);
    }
    
    private static String imprimirLista(ArrayList<Persona> Personas){
        
        String result="";
        
        for (int i = 0; i < Personas.size(); i++) {
            
            result += Personas.get(i).toString();
        }
        
        return result;
        
    }
    
}
