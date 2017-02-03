
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
            lidos=false;
            nonLidosTotais++;
        } 
        else if(elBuzon.get(i).isLidoOunon()==true){
              lidos=true; 
              System.out.println(elBuzon.get(i));
           }
       }
       System.out.println(" Quedan "+nonLidosTotais+" por ler");
       
     return lidos;
   }
   public String amosarPrimeroNoLido(){
       
      int pos =0;
      
       for(int i=0;i<elBuzon.size();i++){
           if(elBuzon.get(i).lidoOunon!=false){
               pos = i;
              
           }
       }System.out.println("la posición es "+pos);
      return amosa(pos);  
   } 
 
   public String amosa(int k){
       Correo c= new Correo();
       c = elBuzon.get(k);
        if(c.lidoOunon==true){
            System.out.println(" O correo foi lido ");
        }else
  
       System.out.println(" O correo non foi lido ");
       return c.toString();
       }
   
  
   public void elimina(int k){
       
       elBuzon.remove(k-1);
  
       System.out.println(" El correo "+ k+" fue eliminado");
}
}