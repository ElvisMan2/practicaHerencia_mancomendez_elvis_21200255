
package modelo;

public class Producto {
private float precio;
private String nombre;
private int Stock;
private String marca;

private Categoria categoria;

    public Producto(float precio, String nombre, int Stock, String marca, Categoria categoria) {
        this.precio = precio;
        this.nombre = nombre;
        this.Stock = Stock;
        this.marca = marca;
        this.categoria = categoria;
    }

    

}
