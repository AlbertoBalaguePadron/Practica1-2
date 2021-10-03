package com.ALbersoft.Myzoo.Animales.Mamiferos;

import com.ALbersoft.Myzoo.Animales.animal;

public class Mamifero extends animal {

    public Mamifero(String nombre, int edad){
        super(nombre, edad);
    }
    public double Peso(){
        double peso = Math.random() * (100 -1) + 1;
        peso = Math.round((peso * 100.0)/100.0);
        return peso;
    }

    public double Velocidad(){
        double velocidad = Math.random() * (20 -1) + 1;
        velocidad = Math.round((velocidad * 100.0)/100.0);
        return velocidad;
    }

    public enum Dieta {herbivoro, carnivoro, omnivoro}
    public enum Habito{nocturno, diurno}

    public String Mostrar(){
        return "El Mamifero " + this.nombre + " tiene " +
                this.edad + " Pesa: " + Peso() +
                " Con una velocidad de: " + Velocidad()
                ;
    }
    // falta los enum ......




}
