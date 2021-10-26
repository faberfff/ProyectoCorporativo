package AbstractFactory;

public class TestingFactory implements ServicioFactory{
    
    @Override
    public ServicioInformatico crearServicio(){
    
        return new ServicioTesting();
        
    }
    
}
