
package uni.sistemas.model;

//clase derivada
public class Profesor extends Persona{
   //atributos
    private double pagoxhora;
    private int horas;

    //constructor
    public Profesor() {
    }

    public Profesor(double pagoxhora, int horas, int id, String nombre, char sexo) {
        super(id, nombre, sexo);
        this.pagoxhora = pagoxhora;
        this.horas = horas;
    }

    //metodos get y set
    public double getPagoxhora() {
        return pagoxhora;
    }

    public void setPagoxhora(double pagoxhora) {
        this.pagoxhora = pagoxhora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    
}
