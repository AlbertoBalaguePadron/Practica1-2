package com.ALbersoft.Myzoo.Animales.Mamiferos;

import com.ALbersoft.Myzoo.Animales.Animal;

import java.util.ArrayList;

public class Mamifero extends Animal {


    private int Peso;
    private String Dieta;
    private String Habito;
    private  int VelocidadDesplazamiento;
    private String TipoMami;

    public Mamifero(String nombre, int edad, String sexo, int Peso, String Dieta, String Habito, int VelocidadDesplazamiento, String TipoMami) {
        super(nombre, edad, sexo);
        this.Peso = Peso;
        this.Dieta = Dieta;
        this.Habito = Habito;
        this.VelocidadDesplazamiento = VelocidadDesplazamiento;
        this.TipoMami = TipoMami;

    }

    public String muestra() {
        return " Nombre = " + nombre + ", edad = " + edad + ", Sexo " +  sexo + ", Peso: " + Peso + ", Dieta " + Dieta + ", Habito " +  Habito + ", Velocidad de Desplazamiento " + VelocidadDesplazamiento + " Km/h Tipo de mámifero " + TipoMami;
    }



}
