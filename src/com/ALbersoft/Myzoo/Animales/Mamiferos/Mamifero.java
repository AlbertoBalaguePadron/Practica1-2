package com.ALbersoft.Myzoo.Animales.Mamiferos;

import com.ALbersoft.Myzoo.Animales.Animal;

import java.util.ArrayList;

public class Mamifero extends Animal {


    private int Peso;
    private String Dieta;
    private String Habito;
    private  int VelocidadDesplazamiento;

    public Mamifero(String nombre, int edad, String sexo, int Peso, String Dieta, String Habito, int VelocidadDesplazamiento) {
        super(nombre, edad, sexo);
        this.Peso = Peso;
        this.Dieta = Dieta;
        this.Habito = Habito;
        this.VelocidadDesplazamiento = VelocidadDesplazamiento;

    }

    public String muestra() {
        return " Nombre = " + nombre + ", edad = " + edad + ", Sexo " +  sexo + ", Peso: " + Peso + ", Dieta " + Dieta + ", Habito " +  Habito + ", Velocidad de Desplazamiento " + VelocidadDesplazamiento + " Km/h";
    }



}
