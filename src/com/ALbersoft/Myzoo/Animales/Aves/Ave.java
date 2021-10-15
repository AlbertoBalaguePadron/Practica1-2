package com.ALbersoft.Myzoo.Animales.Aves;

import com.ALbersoft.Myzoo.Animales.Animal;

public class Ave extends Animal {

    private String ColorPlumas;
    private String TipoAve;
    private int MaxVuelo;
    private String TipoPata;

    public Ave(String nombre, int edad, String sexo, String ColorPlumas, String TipoAve, int MaxVuelo, String TipoPata) {
        super(nombre, edad, sexo);
        this.ColorPlumas = ColorPlumas;
        this.TipoAve = TipoAve;
        this.MaxVuelo =MaxVuelo;
        this.TipoPata = TipoPata;
    }

    public String muestra() {
        return " Nombre = " + nombre + ", edad = " + edad + ", Sexo " +  sexo + ", Color de Pluma: " + ColorPlumas + ", Tipo de ave: " + TipoAve +  ", Máxima altura de vuelo: " + MaxVuelo + " Tipo de Pata : " + TipoPata;
    }



}
