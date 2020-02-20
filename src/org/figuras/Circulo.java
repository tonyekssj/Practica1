package org.figuras;

import java.awt.*;
import java.util.ArrayList;

public class Circulo extends Figuras {
    Circulo(String nombre, double radio){
        super(nombre);
        this.radio=radio;
        this.coordenadas=new ArrayList<Puntos>();
        this.es_valido=this.validarCirculo();
    }
    private double radio;

    private boolean validarCirculo(){
        return(this.radio>0);
    }

    public double CalcularArea(){
        return Math.PI*(this.radio*this.radio);
    }

    public double CalcularPerimetro(){
        return(2*Math.PI)*this.radio;
    }

    public void Dibujar(MiCanvas donde){
        super.Dibujar(donde);
        System.out.println("Dibujar-Circulo");
        donde.getGraphics().setColor(Color.BLACK);
        donde.getGraphics().drawArt(100,100,(int)this.);

    }
}
