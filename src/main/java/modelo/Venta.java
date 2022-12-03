package modelo;

import java.util.Date;

public class Venta {
    private float total;
    private Date fecha;
    private boolean estado;
    
    private Detalle detalle;
    private Cliente cliente;
    private Trabajador trabajador;

    public Venta(Detalle detalle, Cliente cliente, Trabajador trabajador) {
        this.detalle = detalle;
        this.cliente = cliente;
        this.trabajador = trabajador;
        this.fecha=new Date();
        this.estado=false; 
    }
    
    public void agregarProducto(Producto p){
        
    }
    
    
    

}
