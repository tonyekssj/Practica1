package org.figuras;

import java.util.List;

public class Figuras {
    Figuras(String nombre)
    {
        this.nombre=nombre;
        this.es_valido=false;
    }

    private String nombre;
    protected boolean es_valido;
    protected List<Puntos> coordenadas;



    public boolean es_valido(){
        return this.es_valido;
    }

    public void Dibujar(MiCanvas donde){
        System.out.println("Dibujar-Figura");
    }
}
