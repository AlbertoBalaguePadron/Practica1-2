package com.ALbersoft.Myzoo.Animales.Aves;
import java.util.ArrayList;

import com.ALbersoft.Myzoo.Animales.animal;

public class Ave extends animal{
    ArrayList<String> color = new ArrayList<String>();
    String[] colortipoala = {"Rojo", "Verde" , "Negro", "Blanco", "Amarillo", "Naranja", "Marrón"};

    public Ave(String nombre, int edad){
       super(nombre, edad);
    }

    public static double MaxVuelo(){
        double altura = Math.random() * (10000 -1) + 1;
        altura = Math.round((altura * 1.0)/1.0);
        return altura;
    }

    public String ColorPluma(){

        for(int i = 0; i > colortipoala.length; i++){
            color.add(colortipoala[i]);
        }
        double ramdomco = Math.random() * (color.size());
        String colorave = color.get((int) ramdomco);
        return colorave;
    }

    public enum TipoPata {rabo, pija};

    public String Mostrar(){
        return "El ave " + this.nombre + " tiene " + this.edad +
                " edad. Tiene de color de plumas: " + ColorPluma() +
                " De máximo de vuelo: " + MaxVuelo() +
                " Y de tipo de pata "  ;
    }
    // enum tipo pata en mostrar



}
