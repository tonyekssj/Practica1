package org.figuras;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Circulo mi_circulo=new Circulo("circulo", 50.0);
        Triangulo mi_triangulo= new Triangulo("triangulo", 30.0,30.0,30);
        /*
        if(mi_circulo.es_valido()){
            mi_circulo.Dibujar(new MiCanvas());
        }
        if(mi_triangulo.es_valido()){
            mi_triangulo.Dibujar(new MiCanvas());
        }*/

        MiCanvas canvas=new MiCanvas();
        JFrame ventana=new JFrame("Canvas");
        ventana.getContentPane().add(canvas);
        ventana.getSize(400,400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
