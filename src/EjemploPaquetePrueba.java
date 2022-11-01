
import com.gm.Utileria;
//Import com.gm.* ; ,segunda forma de import
//Terceraforma import static
import static com.gm.Utileria.imprimir;

public class EjemploPaquetePrueba {
    public static void main(String[] args){
        com.gm.Utileria.imprimir("Paquetes en Java");

        //Realizando el import
        Utileria.imprimir("Java para progradores paquetes");
        imprimir("Java introducción a paquetes");

    }
}