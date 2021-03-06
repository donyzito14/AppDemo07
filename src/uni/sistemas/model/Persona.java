

package uni.sistemas.model;

// clase base
public class Persona {
   // atributos
    private int id;
    private String nombre;
    private char sexo;
    protected String fecha;
    //constructor
    public Persona() {
    }

    public Persona(int id, String nombre, char sexo) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    // metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
