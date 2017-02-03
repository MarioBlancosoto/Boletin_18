
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
     
       int nonLidosTotais =0;
   
       boolean lidos = false;
       for(int i=0;i<elBuzon.size();i++){
        if(elBuzon.get(i).isLidoOunon()==false){
            
            nonLidosTotais++;
        } 
           else{
              lidos=true; 
              System.out.println(elBuzon.get(i));
           }
       }
       System.out.println(" Quedan "+nonLidosTotais+" por ler");
       
     return lidos;
   }
   public String amosarPrimeroNoLido(){
       
      int pos =0;
      //probando
       for(int i=0;i<elBuzon.size();i++){
           if(elBuzon.get(i).lidoOunon!=false){
               pos = elBuzon.indexOf(i);
              
           }
       }System.out.println("la posición es "+pos);
      return amosa(pos);  
   } 
 
   public String amosa(int k){
       Correo c= new Correo();
       c = elBuzon.get(k-1);
     c.setLidoOunon(true);
     elBuzon.set(k, c);
     return c.toString();
       }
   
  
   public void elimina(int k){
       
       elBuzon.remove(k-1);
  

}
}