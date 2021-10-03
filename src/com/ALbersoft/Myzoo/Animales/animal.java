package com.ALbersoft.Myzoo.Animales;

import com.ALbersoft.Myzoo.Espacios.Espacio;

public class animal extends Espacio {
    public String nombre;
    public int edad;

    public animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public enum sexo{Femenino, Masculino};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}