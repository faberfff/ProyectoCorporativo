
package AbstractFactory;

public class ServicioAnalitica implements ServicioInformatico{
    
    @Override
    public void asignarConsultor(){
        System.out.println("Consultor Asignado: Andrea Tamayo.");
    }
    
    @Override
    public void tiempoEntrega(){
        System.out.println("Tiempo Asignado: Cinco (5) días.");
    }
    
    @Override
    public void precioBase(){
        System.out.println("Precio Base: $950.000");
    }
}
