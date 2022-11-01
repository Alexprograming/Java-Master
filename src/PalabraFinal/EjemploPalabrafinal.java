package PalabraFinal;

public class EjemploPalabrafinal {
    public static void main(String[]args){

        //Modificar la referencia de un atributo tipo object
        //Accedemos a los static
        ClaseFinal.VAR_PERSONA.setNombre("Luis Perez: 'Programador'");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());

        ClaseFinal.VAR_PERSONA.setNombre("Ana Fritz: 'Diseñador'");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
}
