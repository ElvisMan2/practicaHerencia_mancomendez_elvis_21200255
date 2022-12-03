/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    
    private CategoriaArreglo categorias;
    private PersonaArreglo clientes;
    
    
    public void agregarCliente(Cliente c){
       clientes.agregarPersona(c);
    }
    
    public void crearCategoria(Categoria cat){
        categorias.agregar(cat);
    }
    
    
}
