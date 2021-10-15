package com.ALbersoft.Myzoo.Animales.Reptiles;

import com.ALbersoft.Myzoo.Animales.Animal;

public class Reptil extends Animal {

    private double Temperatura;
    private String ColorEscamas;
    private int Velocidad;
    private String TipoReptil;

    public Reptil(String nombre, int edad, String sexo, double Temperatura, String ColorEscamas, int Velocidad, String TipoReptil) {
        super(nombre, edad, sexo);
        this.Temperatura = Temperatura;
        this.ColorEscamas = ColorEscamas;
        this.Velocidad = Velocidad;
        this.TipoReptil = TipoReptil;
    }


    public String muestra() {
        return " Nombre = " + nombre + ", edad = " + edad + ", Sexo " +  sexo + ", Color de escama: " + ColorEscamas + ", Tipo de Reptil: " + TipoReptil +  ", Temperatura: " + Temperatura + " Velocidad de desplazamiento " + Velocidad + " Km/h";
    }


}

