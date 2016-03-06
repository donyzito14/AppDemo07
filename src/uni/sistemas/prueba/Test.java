package uni.sistemas.prueba;

import uni.sistemas.model.Empleado;
import uni.sistemas.model.Profesor;

public class Test {

    public static void main(String[] args) {
        // variables de instancia de empleado
        Empleado emp = new Empleado();
        //asignar valores al objeto
        emp.setId(100);
        emp.setNombre("Juanito Perez");
        emp.setSexo('M');
        emp.setSueldo(2600);
        System.out.println("================================");
        System.out.println("Datos de Empleado");
        System.out.println("Codigo  :" + emp.getId());
        System.out.println("Nombre  :" + emp.getNombre());
        System.out.println("Sexo    :" + emp.getSexo());
        System.out.println("Sueldo  :" + emp.getSueldo());
        System.out.println("Fecha   :" + emp.getFecha());
        // variable de instancia de profesor
        Profesor pro = new Profesor(35, 24, 110, "Perico de los Palotes", 'M');
        System.out.println("================================");
        System.out.println("Datos de Profesor");
        System.out.println("Codigo  :" + pro.getId());
        System.out.println("Nombre  :" + pro.getNombre());
        System.out.println("Sexo    :" + pro.getSexo());
        System.out.println("Sueldo x Hora  :" + pro.getPagoxhora());
        System.out.println("Nro. de Horas  :" + pro.getHoras());
        System.out.println("Sueldo   :" + pro.getHoras() * pro.getPagoxhora());
    }

}
