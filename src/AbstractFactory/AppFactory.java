
package AbstractFactory;

public class AppFactory implements ServicioFactory{
    @Override
    public ServicioInformatico crearServicio(){
        return new ServicioApp();
    }
}
