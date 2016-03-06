
package uni.sistemas.model;

//clase derivada
public class Empleado extends Persona{
    //atributos
    private double sueldo;

    //constructor
    public Empleado() { 
      this.fecha="15/01/2016";//atributo protected
    }

    public Empleado(double sueldo, int id, String nombre, char sexo) {
        super(id, nombre, sexo);
        this.sueldo = sueldo;       
    }

    // metodo get y set
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public String getFecha() {
        return fecha;
    }
    
}
