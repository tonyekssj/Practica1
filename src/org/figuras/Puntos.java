package org.figuras;

public class Puntos {
    Puntos(double x, double y){
        this.x=x;
        this.y=y;
    }
    private double x;
    private double y;

    public double GetX(){
        return this.x;
    }

    public double GetY(){
        return this.y;
    }
}
