/*  La clase MotorEmision hereda de las clases EmisionHidrocarburo,
    EmisionMonoxidoCarbono y EmisionOxidoNirtrogeno.
 */
package motoremision;
/*
 * @author Quishpe Urrutia Job Nicolas
 */
interface EmisionHidrocarburo{
    default String Emision(String nombre){
        return " Hidrocarburos"+nombre;
    } 
}

interface EmisionMonoxidoCarbono{
    default String Emision(String nombre){
        return " Monoxido de Carbono";
    }
}

interface EmisionOxidoNitrogeno{
    default String Emision(String nombre){
        return " Óxido de Nitrogeno";
    }
}
public class MotorEmision implements EmisionHidrocarburo, EmisionMonoxidoCarbono, EmisionOxidoNitrogeno{
/*
    @Override
        public String Emision(String nombre){
            return EmisionHidrocarburo.super.Emision(nombre);
        }*/
    /*
    @Override
        public String Emision(String nombre){
            return EmisionMonoxidoCarbono.super.Emision(nombre);
        }*/
        
    @Override
        public String Emision(String nombre){
            return EmisionOxidoNitrogeno.super.Emision(nombre);
        }    
        
    public static void main(String[] args) {
        MotorEmision motoremision = new MotorEmision();
        System.out.println("                                Universidad de las Fuerzas Armadas ESPE ");
        System.out.println("                                            Sede Latacunga");
        System.out.println("Asignatura: Programacion [7450]");
        System.out.println("Alumno: Job Nicolas Quishpe Urrutia");
        System.out.println("Docente: Ing. Guerra Cruz Luis Alberto");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Tema: Herencia Múltiple\n\n");
        
        
        System.out.println(motoremision.Emision("\n Es un tipo de emisión contaminante,"));
        System.out.println(" Es un tipo de emisión contaminante,");
        System.out.println(" expulsada por el Motor de Combustión Interna.");
    }
}
