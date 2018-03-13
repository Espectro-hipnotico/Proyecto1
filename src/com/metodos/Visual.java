package com.metodos;

import static com.menus.Menus.*;
import java.awt.Font;
import javax.swing.JTextArea;

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

    public void cambiarTamaño() {
        
        JTextArea jta=new JTextArea();
       // jta.setFont(new Font((String) dlm.getElementAt(jListaF.getSelectedIndex()), Font.PLAIN, f.getSize()));

    }

}
