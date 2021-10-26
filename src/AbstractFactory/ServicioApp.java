
package AbstractFactory;

public class ServicioApp implements ServicioInformatico{
    
    @Override
    public void asignarConsultor(){
        System.out.println("Consultor asignado: Fernando Ramos.");
    }
    @Override
    public void tiempoEntrega(){
        System.out.println("Tiempo Asignado: Cuatro (4) días.");
    }
    @Override
    public void precioBase(){
        System.out.println("Precio base: $850.000");
    }
}
