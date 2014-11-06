
package boletin76;


public class articulo {
    private int ventAnual;
    
    public articulo(){
        
    }
    public articulo(int v){
        ventAnual=v;
    }
    public void setVenta(int v){
        ventAnual=v;
    }
    public int getVenta(){
        return ventAnual;
    }
    public void tipo(){
        if(ventAnual<=100){
            System.out.println("O articulo é baixo");
        }
        else if(ventAnual>100&&ventAnual<=500){
            System.out.println("O articulo é medio");
        }
        else if(ventAnual>500&&ventAnual<=1000){
            System.out.println("O artigo é alto");
        }
        else if(ventAnual>1000){
            System.out.println("O articulo é de primeira necesidade");
        }
       
    }
    
}
