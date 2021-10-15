package com.ALbersoft.Myzoo.Myzoo;
import com.ALbersoft.Myzoo.Animales.Animal;
public class Espacios extends Main{



    public static void CrearZoo(int celdas, int animales){

        if(celdas > animales){
            Animal.CrearAnim(celdas, animales);
        } else if ( (celdas * 2) < animales) {
            Animal.CrearAnim(celdas, animales);
        } else {
            System.out.println("Error en los parámetros introducidos");
        }
    }
}
