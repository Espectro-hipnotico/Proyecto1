package com.metodos;

import static com.menus.Menus.*;
import java.awt.Color;

import java.awt.Font;
import java.io.File;
import java.io.InputStream;
import static java.nio.file.Files.size;

public class Visual {
    // Variabla para el metodo CustomFont
private Font font = null;

    public void verPanelesMenus(String nombrePanel) {

        switch (nombrePanel) {
            case "jPTraductor":
                jPTraductor.setVisible(true);
                jPComunes.setVisible(false);
                jConfig.setVisible(false);
                jIdioma.setVisible(false);
                break;
            case "jPComunes":
                jPComunes.setVisible(true);
                jPTraductor.setVisible(false);
                jConfig.setVisible(false);
                jIdioma.setVisible(false);
                break;
            case "jConfig":
                jConfig.setVisible(true);
                jPTraductor.setVisible(false);
                jPComunes.setVisible(false);
                jIdioma.setVisible(false);
                break;
            case "jIdioma":
                jIdioma.setVisible(true);
                jConfig.setVisible(false);
                jPTraductor.setVisible(false);
                jPComunes.setVisible(false);
                break;

        }

    }

    public void cambiarTexto(String f, Integer size) {
        
        String algo;

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

    
    
    // Crea una fuente
    public void CustomFont(String fuente) {

        String fontName = fuente;

        try {
            //Se carga la fuente
//            InputStream is =  getClass().getResourceAsStream(fontName);
//            font = Font.createFont(Font.TRUETYPE_FONT, is);
            font = Font.createFont(Font.TRUETYPE_FONT, new File("src/fonts/"+fontName+".ttf"));
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
    }

    /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
 * tamanio = float
     */
    public Font MyFont(int estilo, Integer tamanio) {
        Font tfont = font.deriveFont(estilo, tamanio);
         
         return tfont;
    }

}
