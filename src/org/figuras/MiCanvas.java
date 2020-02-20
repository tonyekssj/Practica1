package org.figuras;

import javax.swing.*;
import java.awt.*;

public class MiCanvas extends JComponent {

    public void init(){
        this.un_circulo= new Circulo("circulo",50);
        this.un_triangulo=new Triangulo("Triangulo",200,100,100);
    }
    private Triangulo un_triangulo;
    private Circulo un_circulo;

    @Override
    public void update(Graphics g){
        //super.update(g);

    }

}
