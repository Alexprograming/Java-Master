package PalabraFinal;

public class ClaseFinal {

    //Variable marcada como final
    //Modificador final
    //Final dentro de un constructor
    //public final int no podemos acceder unicamente con el nombre de la clase
    public final int varNumero = 23;

    //Constantes mayusculas
    //Variante al trabajar con objetos
    //La accedemos con el nombre de la clase o con Static
    public static final int VAR_PRIMITIVE = 32;
    
    public static final Persona VAR_PERSONA = new Persona();

    //Método final
    public final void metodoFinal(){}

    }
    //No es posible crear clases hijas con final
    //class ClaseHija extends ClaseFinal{
    //public void metodoFinal(){

