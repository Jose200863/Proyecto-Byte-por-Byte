/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistIluminacion;
import Interfaces.Encender;

/**
 *
 * @author Gloriana
 */
public abstract class Luces implements Encender{
   //debido a que las luces emergencia, puertas, traseras 
   //contienen los mismo atributos y metodos se usara la misma clase
   private boolean luz;

   public boolean isluz() {
       return luz;
    }
    //constructor
    public Luces(boolean luz) {
        this.luz = false;
    }
    //importado de interfases
    public void encender(boolean luz){
       this.luz = true; 
    }
    public void apagar(boolean luz){
       this.luz = true; 
    }
} 

