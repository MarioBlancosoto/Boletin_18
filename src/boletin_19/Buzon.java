
package boletin_19;

import java.util.ArrayList;


public class Buzon {
    
    private ArrayList<Correo>elBuzon = new ArrayList();
    
    
    public Buzon(){
        
    }
    public void engadeCorreo(Correo c){
        
      
        elBuzon.add(c);
        
    }
   public int numeroDeCorreos(){
       
     return elBuzon.size();
       
   }
   public boolean porLer(){
       Correo c = new Correo();
       int nonLidosTotais =0;
   
       boolean lidos = false;
       for(int i=0;i<elBuzon.size();i++){
        if(elBuzon.get(i).isLidoOunon()){
            
            nonLidosTotais++;
        } 
           else if(elBuzon.get(i).lidoOunon==true){
              lidos=true; 
           }
       }
       System.out.println(" Quedan "+nonLidosTotais+" por ler");
       
     return elBuzon.contains(c);
   }
   public int amosarPrimeroNoLido(){
      int pos =0;
      //probando
       for(int i=0;i<elBuzon.size();i++){
           if(elBuzon.get(i).lidoOunon!=false){
               pos = elBuzon.indexOf(i);
              
           }
       }
      return pos;  
   } 
 
   public String amosa(int k){
       Correo correo1 = new Correo();
       correo1 = elBuzon.get(k-1);
     if(elBuzon.get(k-1).lidoOunon){
         elBuzon.get(k).setLidoOunon(true);
     }
     return correo1.toString();
       }
   
  
   public void elimina(int k){
       
       elBuzon.remove(k-1);
  

}
}