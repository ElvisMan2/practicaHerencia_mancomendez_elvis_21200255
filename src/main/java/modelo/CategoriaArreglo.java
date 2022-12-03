package modelo;


public class CategoriaArreglo {
    private Categoria[] categorias;
    private int indice;

    public CategoriaArreglo(int tamanio) {
        this.categorias = new Categoria[tamanio];
        this.indice=0;
    }
    
    public void agregar(Categoria cat){
        
        if(indice<this.categorias.length){
        
           categorias[this.indice]=cat;
           this.indice++;
        }
        else{
        //el arreglo crece
        
        }
        
        
    }
}
