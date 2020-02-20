package org.figuras;

import java.util.ArrayList;

public class Triangulo extends Figuras {



    Triangulo(String nombre, double ladoA, double ladoB, double ladoC){
        super(nombre);
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoB=ladoB;
        this.anguloA=0;
        this.anguloB=0;
        this.anguloC=0;
        this.coordenadas= new ArrayList<Puntos>();
        this.es_valido=this.validarTriangulo();

    }

    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double anguloA;
    private double anguloB;
    private double anguloC;

    private boolean validarTriangulo(){
        return((this.ladoA+this.ladoB>this.ladoC)&&(this.ladoB+this.ladoC>this.ladoA)&&(this.ladoA+this.ladoC>this.ladoB));
    }

    public void sacarAngulos(){
    double angulo_A = (Math.pow(this.ladoA,2) - Math.pow(this.ladoB,2) - Math.pow(ladoC,2) / (-2*this.ladoB * this.ladoC));
    this.anguloB
    }

    public void Dibujar(MiCanvas donde){
        super.Dibujar(donde);
        System.out.println("Dibujar-Triangulo");
    }
}
