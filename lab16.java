package lab16;

import javax.swing.*;
import java.awt.*;

public class lab16 extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("House");
        Canvas canvas = new lab16();
        canvas.setSize(500,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //Стены
        g.drawRect(50,150,150,150);

        //Окно
        g.drawRect(75,200,50,50);

        //Левая часть крыши
        g.drawLine(25,175,125,75);

        //Правая часть крыши
        g.drawLine(125,75,225,175);

        //Труба
        g.drawLine(150,100,150,75);
        g.drawLine(175,125,175,75);
        g.drawLine(150,75,175,75);
        g.drawLine(150,75,175,75);

        //Основание дерева
        g.drawLine(335,300,335,250);
        g.drawLine(365,300,365,250);

        //Крон дерева
        g.drawArc(275,51,150,200,-80,340);

        //Земля
        g.drawLine(0,300,500,300);
    }
}
