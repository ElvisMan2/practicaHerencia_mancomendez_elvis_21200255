
package modelo;

import java.util.Date;

public class Trabajador  extends Persona{
    private String password;
    private String email;

    public Trabajador(String password, String email, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.password = password;
        this.email = email;
    }
    
    
}
