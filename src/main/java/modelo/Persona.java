
package modelo;

import java.util.Date;


public class Persona {
    protected String nombre;
    protected String paterno;
    protected String materno;
    protected Date nacimiento;
    protected String numDocumento;

    public Persona(String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacimiento = nacimiento;
        this.numDocumento = numDocumento;
    }
    
    
}
