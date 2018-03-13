package com.metodos;

import static com.menus.Menus.*;
import java.awt.Color;

import java.awt.Font;
import javax.swing.JColorChooser;

public class Visual {

    public void verPanelesMenus(String nombrePanel) {

        switch (nombrePanel) {
            case "jPTraductor":
                jPTraductor.setVisible(true);
                jPComunes.setVisible(false);
                jConfig.setVisible(false);
                break;
            case "jPComunes":
                jPComunes.setVisible(true);
                jPTraductor.setVisible(false);
                jConfig.setVisible(false);
                break;
            case "jConfig":
                jConfig.setVisible(true);
                jPTraductor.setVisible(false);
                jPComunes.setVisible(false);
                break;

        }

    }

    public void cambiarTamaño(String f, Integer size) {

        jPrueba.setFont(new Font(f, Font.PLAIN, size));

        jTTraducir.setFont(new Font(f, Font.PLAIN, size));
        jTAreaTraducido.setFont(new Font(f, Font.PLAIN, size));
        jBtn_traducir.setFont(new Font(f, Font.PLAIN, size));
        jTBInvertir.setFont(new Font(f, Font.PLAIN, size));
        jMTraductor.setFont(new Font(f, Font.PLAIN, size));
        jMComunes.setFont(new Font(f, Font.PLAIN, size));
        jMAdmin.setFont(new Font(f, Font.PLAIN, size));
        jMIConfig.setFont(new Font(f, Font.PLAIN, size));
        jMIdioma.setFont(new Font(f, Font.PLAIN, size));
    }

    public void cambiarColorFondo(Color c) {

        jConfig.setBackground(c);
        jPComunes.setBackground(c);
        jPTraductor.setBackground(c);
    }

    public void cambiarColorBotones(Color c) {

        jBColorF.setBackground(c);
        jBColorB.setBackground(c);
        jBColorL.setBackground(c);
        jBtn_traducir.setBackground(c);
        jTBInvertir.setBackground(c);

    }

    public void cambiarColorLetras(Color c) {
        jPrueba.setForeground(c);

        jTTraducir.setForeground(c);
        jTAreaTraducido.setForeground(c);
        jBtn_traducir.setForeground(c);
        jTBInvertir.setForeground(c);
        jMTraductor.setForeground(c);
        jMComunes.setForeground(c);
        jMAdmin.setForeground(c);
        jMIConfig.setForeground(c);
        jMIdioma.setForeground(c);

        jConfig.setForeground(c);
        jPComunes.setForeground(c);
        jPTraductor.setForeground(c);

        jBColorF.setForeground(c);
        jBColorB.setForeground(c);
        jBColorL.setForeground(c);
        jBtn_traducir.setForeground(c);
        jTBInvertir.setForeground(c);

    }

}
