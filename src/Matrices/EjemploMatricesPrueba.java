package Matrices;

public class EjemploMatricesPrueba {
    public static void main(String[] args){
        //Declarar matriz
        int edades[][];
        //Iniciamos matriz
        //3 filas , 2 columnas
        edades = new int[3][2];
        //Instanciar valores
        edades[0][0] = 27;
        edades[0][1] = 43;
        edades[1][0] = 20;
        edades[1][1] = 53;
        edades[2][0] = 63;
        edades[2][1] = 53;

        //Imprimir valores
        System.out.println("Matriz indice 0 0: " + edades[0][0]);
        System.out.println("Matriz indice 2 0: " + edades[2][0]);

        //Declarar ,instanciar matriz objeto tipo persona
        Persona persona[][] = new Persona[1][2];
        persona[0][0] = new Persona("Luis Perez");
        persona[0][1] = new Persona("Marco Gilp");

        //Imprimir valores
        System.out.println("Matriz persona inice 0 0: " + persona[0][0] + " : " + edades[2][0]);
        System.out.println("Matriz persona inice 0 1: " + persona[0][1]);

        //Recorrer el arreglos
        for(int filas = 0; filas < persona.length; filas++){
            for(int columna = 0 ; columna < persona[filas].length; columna++){
                System.out.println("Matriz personas:" + filas + " : " + columna + " : " + persona[filas][columna]);
            }
        }
    }
}
