package modelo;

public class ProductoArreglo {
    private Producto[] productos;
    private int i;

    public ProductoArreglo(int tam) {
        productos= new Producto[tam];
        i=0;
    }
    
   public void agregar(Producto prod){
       
       if(i<productos.length){
            productos[this.i]=prod;
            i++;
       }
       else{
          //crecer
       
       }
       
       
       
       
   } 
    
    
}
