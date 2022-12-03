package modelo;


public class Categoria {
    private String nombre;
    private boolean disponible;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.disponible=true;// se considera disponible cuando se crea
    }
    
    
}
