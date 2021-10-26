package Principal;
import AbstractFactory.TestingFactory;
import AbstractFactory.ServicioFactory;
import AbstractFactory.ServicioInformatico;
import AbstractFactory.AnaliticaFactory;
import AbstractFactory.AppFactory;
import java.util.Scanner;

public class Main {
    
    private static Scanner S = new Scanner(System.in);
    
    public static void main(String[] args){
        int o;
        do{
            o = preguntarServicio();
            switch(o){
                case 1:
                    usarServicio(new TestingFactory());
                    break;
                case 2:
                    usarServicio (new AnaliticaFactory());
                    break;
                case 3:
                    usarServicio (new AppFactory());
                    break;
                case 4:
                    System.out.println("Cerro el Programa");
                    break;
                default:
                    System.out.println("Se ingreso una opción Invalida.");  
            }
            System.out.println("\n");
        }while(o!=4);
   }
    
    public static void usarServicio(ServicioFactory factory){
        ServicioInformatico servicio = factory.crearServicio();
        servicio.asignarConsultor();
        servicio.tiempoEntrega();
        servicio.precioBase();
    }
    
    public static int preguntarServicio(){
        System.out.print(
            "MENU DE SERVICIOS\n"
           +"1.Solicitar Servicio Testing\n"
           +"2.Solicitar Servicio Analitica\n"
           +"3.Solicitar Servicio App Movil\n"
           +"4.Cierre la aplicación\n"
           +"Seleccionar Opción:"
        );
        return Integer.parseInt( S.nextLine());
    }
}
