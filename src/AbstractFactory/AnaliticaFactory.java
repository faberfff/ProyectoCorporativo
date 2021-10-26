package AbstractFactory;

public class AnaliticaFactory implements ServicioFactory{
    
    @Override
    public ServicioInformatico crearServicio(){
        return new ServicioAnalitica();
    }
}
