
package boletin_19;


public class Correo {
    String contido;
    boolean lidoOunon ;

    
    public Correo(){
        
        
    }
    public Correo(String contido, boolean LidoOunon) {
        this.contido = contido;
        this.lidoOunon = LidoOunon;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public void setLidoOunon(boolean LidoOunon) {
        this.lidoOunon = LidoOunon;
    }

    public boolean isLidoOunon() {
        return lidoOunon;
    }
   

    @Override
    public String toString() {
        return "Correo{" + "contido=" + contido + ", LidoOunon=" + lidoOunon + '}';
    }
    
    
    
   
}

