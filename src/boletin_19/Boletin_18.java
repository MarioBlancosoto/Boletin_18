
package boletin_19;
import javax.swing.JOptionPane;
import milibreria.Milibreria;

public class Boletin_18 {

 
    public static void main(String[] args) {
        int select;
        Buzon buz = new Buzon();
        Milibreria dato = new  Milibreria();
       
    do{
         select = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción" 
        +"\n 1.Engadir Correo \n 2.Número de Correos Totais \n 3.Número de Correos por leer "
        +"\n 4.Amosar o primeiro non lido \n 5.Amosa K \n 6.Elimina Correo \n 7.Sair"       ));
    
       switch(select){
           
           case 1: buz.engadeCorreo(new Correo(dato.pedirString(),dato.pedirBooleano()));
               break;
           case 2: System.out.println("O número de correos totais e "+buz.numeroDeCorreos());
               break;
           case 3: buz.porLer();
               break;
           case 4: System.out.println(buz.amosarPrimeroNoLido());
               break;
           case 5: System.out.println(buz.amosa(dato.pedirEntero()));
               break;
           case 6: buz.elimina(dato.pedirEntero());
               break;
           case 7: System.exit(select);
       }    
       }while(select!=0);
   
            }      
           }