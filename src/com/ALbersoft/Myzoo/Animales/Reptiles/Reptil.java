package com.ALbersoft.Myzoo.Animales.Reptiles;

import com.ALbersoft.Myzoo.Animales.animal;

import java.util.ArrayList;

public class Reptil extends animal {

    ArrayList<String> color = new ArrayList<String>();
    String[] colortipoala = {"Rojo", "Verde" , "Negro", "Blanco", "Amarillo", "Naranja", "Marrón"};

    public Reptil(String nombre, int edad){
        super(nombre, edad);
    }

    public double temperatura(){
        double temp = Math.random() * (20 -1) + 1;
        temp = Math.round((temp * 100.0)/100.0);
        return temp;
    }


    public String ColorReptil(){

        for(int i = 0; i > colortipoala.length; i++){
            color.add(colortipoala[i]);
        }
        double ramdomco = Math.random() * (color.size());
        String colorave = color.get((int) ramdomco);
        return colorave;
    }

    public double Velocidad_desplacamiento(){
        double velocidad = Math.random() * (20 -1) + 1;
        velocidad = Math.round((velocidad * 100.0)/100.0);
        return velocidad;
    }

    public String Mostrar(){
        return "El reptil " + this.nombre + " tiene " +
                this.edad + " años,  es de color: " +
                ColorReptil() + " Con una velocidad de desplazamiento de : " +
                Velocidad_desplacamiento() + " Y con una temperatura de  " +
                temperatura();
    }

}

