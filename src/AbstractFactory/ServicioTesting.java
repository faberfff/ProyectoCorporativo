package AbstractFactory;

public class ServicioTesting implements ServicioInformatico{
    
    @Override
    public void asignarConsultor(){
        System.out.println("Consultor Asignado: Pablo Duncan.");
    }
    
    @Override
    public void tiempoEntrega(){
        System.out.println("Tiempo Asignado: Tres (3) días.");
    }
    
    @Override
    public void precioBase(){
        System.out.println("Precio Base: $750.000");
    }
    
}
