
package modelo;

public class PersonaArreglo {
    private Persona[] personas;
    private int i;

    public PersonaArreglo(int tam) {
        this.personas=new Persona[tam];
        this.i=0;
    }
    
    public void agregarPersona(Persona persona){
        if(this.i<personas.length){
            this.personas[i]=persona;
            this.i++;
        }
        else
        {
        //aumentar
        }
            
        
    
    }
    
    
    
}
