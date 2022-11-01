package Arreglos;


import java.awt.*;

public class EjemploArreglos {
    public static void  main(String[] args){
        //Variable tipo arreglo
        int edades[];

        //Instanciamos arreglo
        edades = new int[5];

        //Inicializar valores del arreglo
        edades[0] = 30;
        edades[1] = 23;
        edades[2] = 34;
        edades[3] = 45;
        edades[4] = 53;

        //Imprimir valores
        System.out.println("Arreglo 1: " + edades[3]);
        System.out.println("Arreglo 2: " + edades[4]);
        System.out.println("Arreglo 3: " + edades[2]);

        //Arreglo tipo object
        Persona persona1[] = new Persona[5];
        persona1[1] = new Persona("Luis Perez");
        persona1[2] = new Persona("Carlos Murphy");

        System.out.println("La edad de Luis Perez es: " + edades[1]);

        //Notación simplificada
        String nombre[] = {"Luis" , "Martha" , "Eduardo" , "Carla" , "Sara"};
        for(int i = 0 ; i < nombre.length ; i++){
            System.out.println("Arreglo String: " + i + nombre[i]);
        }
    }
}
