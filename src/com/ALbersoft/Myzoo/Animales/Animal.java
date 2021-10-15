package com.ALbersoft.Myzoo.Animales;

import java.util.concurrent.ThreadLocalRandom;
import com.ALbersoft.Myzoo.Myzoo.Espacios;
import com.ALbersoft.Myzoo.Animales.Aves.Ave;
import com.ALbersoft.Myzoo.Animales.Reptiles.Reptil;
import com.ALbersoft.Myzoo.Animales.Mamiferos.Mamifero;

import java.util.Random;

public class Animal extends Espacios {

    private static int Valor;
    public String nombre;
    public int edad;
    public String sexo;
    private static String[] Nombresanimal= {
            "Tifón", "El bicho", "Mango", "Piña",
            "Juan", "Yasuo", "Misufú", "Bonbom",
            "Ramtamplám", "Harambe", "Chimuelo",
            "Yogu", "Pesiruí", "Brego", "Tora",
            "Yumeko", "Coco", "Linnea", "Bley",
            "Luna", "Dio", "Jotaro"};

    public static Random ramd = new Random();
    private static String[] sexos = { "Hembra", "Macho"};

    // Lita de Aves
    private static String[] TipoPa = { "garra", "palmímpeda"};
    private final static String[] TipoA = {"Alcón", "Condor", "Ágila", "Canario", "Cuervo"};
    private final static String[] ColorPlumas = {"Blanco", "Rojo", "Azul", "Amarillo", "Negro", "Verde", "Naranja"};
    // lista para Reptiles
    private final static String[] TipoR = {"Serpiente", "Tortuga", "Lagarto", "Dragón de comodo", "Cocodrilo"};
    private final static String[] ColorEscamas = {"Blanco", "Rojo", "Azul", "Amarillo", "Negro", "Verde", "Naranja"};
    // Lista de Mamíferos
    private final static String[] TipoM = {"Leopardo", "Tigre", "Perro", "León", "Gato"};
    private final static String[] TipoDieta = {"Herbivoro", "Carnivoro", "Omnivoro"};
    private final static String[] TipoHabito = {"Diurno", "Nocturno"};


    public Animal(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    protected static int edad(){
        double edad = Math.random() * (10 -1) + 1;
        return (int) edad;
    }

    protected static String sexo() {
        return sexos[ramd.nextInt(sexos.length)];
    }

    public static String NombreRamdom(){
        return Nombresanimal[ramd.nextInt(Nombresanimal.length)];
    }

    /* Valores de ave .. */
    protected static String TipoAve(){
        return TipoA[ramd.nextInt(TipoA.length)];
    }
    protected static String ColorPlumas(){
        return ColorPlumas[ramd.nextInt(ColorPlumas.length)];
    }
    protected static int MaxVuelo(){
        return ramd.nextInt(11277);
    }
    protected static String TipoPata(){
        return TipoPa[ramd.nextInt(TipoPa.length)];
    }

    /* Valores de reptil */
    protected static String ColorEscamas(){
        return ColorEscamas[ramd.nextInt(ColorEscamas.length)];
    }
    protected static String TipoReptil(){
        return TipoR[ramd.nextInt(TipoR.length)];
    }
    protected static double Temperatura(){
        double randomDbl = ThreadLocalRandom.current().nextDouble(25);

        return   Math.floor(randomDbl * 100) / 100;
    }
    protected static int Velocidad(){
        return ramd.nextInt(20);
    }

    /*  Valores mamíferos */
    protected static String TipoMami(){return TipoM[ramd.nextInt(TipoM.length)];}
    protected static String Dieta(){
        return TipoDieta[ramd.nextInt(TipoDieta.length)];
    }
    protected static String Habito(){
        return TipoHabito[ramd.nextInt(TipoHabito.length)];
    }
    protected static int Peso(){
        return ramd.nextInt(100);
    }
    protected static int VelocidadDesplazamiento(){
        return ramd.nextInt(60);
    }

    public static void CrearAnim(int celdas, int animales) {

        for (int i = 0; i < animales; i ++){
            Valor = ramd.nextInt(3);


            switch (Valor){
                case  0:
                    Ave pajaro = new Ave(NombreRamdom(), edad(), sexo(), ColorPlumas(), TipoAve(), MaxVuelo(), TipoPata());
                    System.out.println(pajaro.muestra());
                    break;
                case 1:
                    Reptil Rept1 = new Reptil(NombreRamdom(), edad(), sexo(), Temperatura(), ColorEscamas(), Velocidad(), TipoReptil());
                    System.out.println(Rept1.muestra());
                    break;
                case 2:
                    Mamifero Mami1 = new Mamifero(NombreRamdom(), edad(), sexo(), Peso(), Dieta(), Habito(), VelocidadDesplazamiento(), TipoMami());
                    System.out.println(Mami1.muestra());
                    break;
            }

        }

    }

}


