
package boletin_19;

import java.util.ArrayList;


public class Buzon {
    
    private ArrayList<Correo>elBuzon;
    
    
    public Buzon(){
        elBuzon = new ArrayList<Correo>();
    }
    public void engadeCorreo(Correo c){
        
      
        elBuzon.add(c);
        
    }
   public int numeroDeCorreos(){
       
     return elBuzon.size();
       
   }
   public boolean porLer(){
       int nonLidosTotais =0;
   
       boolean lidos = false;
       for(int i=0;i<elBuzon.size();i++){
        if(elBuzon.get(i).isLidoOunon()){
            
            nonLidosTotais++;
        } 
           else if(nonLidosTotais!=0){
              lidos=true; 
           }
       }
       return lidos;
     
   }
   public int amosarPrimeroNoLido(){
      int pos =0;
      
       for(int i=0;i<elBuzon.size();i++){
           if(elBuzon.get(i).lidoOunon!=false){
               pos = (i);
              
           }
       }
      return pos;  
   } 
 
  /* public String amosa(int k){
       
    elBuzon.add()
   }
  
   public void elimina(int k){
       
       elBuzon.remove(k)
 */  

}
