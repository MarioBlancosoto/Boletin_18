
package boletin_19;
import javax.swing.JOptionPane;
import milibreria.Milibreria;

public class Boletin_18 {

 
    public static void main(String[] args) {
        int select = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción" 
        +"\n 1.Engadir Correo \n 2.Número de Correos Totais \n 3.Número de Correos sen leer "
        +"\n 4.Amosar o primeiro non lido"       ));
        Buzon buz = new Buzon();
        Milibreria dato = new  Milibreria();
        
    
       switch(select){
           
           case 1: buz.engadeCorreo(new Correo(dato.pedirString(),false));
           
           case 2: buz.numeroDeCorreos();
           
           case 3: buz.porLer();
           
           case 4: buz.amosarPrimeroNoLido();
       }
    }
    
}
