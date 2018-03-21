package com.metodos;

import static Inicio.Inicio.*;
import static com.menus.Menus.*;
import java.awt.Color;
import java.awt.Font;
import java.io.File;


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

    public static void textPredefinido() {

        String f = "arial";
        Integer size = 14;

        jTituloInicio.setFont(new Font("Tahoma", Font.BOLD, 24));
        jComboInicio.setFont(new Font(f, Font.PLAIN, size));
        jPassInicio.setFont(new Font(f, Font.PLAIN, size));
        jBInicio.setFont(new Font(f, Font.PLAIN, size));
        jTraductorMenu.setFont(new Font(f, Font.PLAIN, size));
        jComunesMenu.setFont(new Font(f, Font.PLAIN, size));
        jAdminMenu.setFont(new Font(f, Font.PLAIN, size));
        jConfigMenu.setFont(new Font(f, Font.PLAIN, size));
        jIdiomaMenu.setFont(new Font(f, Font.PLAIN, size));
        jTituloTraducir.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTTraducir.setFont(new Font(f, Font.PLAIN, size));
        jTituloTraducido.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTTraducido.setFont(new Font(f, Font.PLAIN, size));
        jCIdioma.setFont(new Font(f, Font.PLAIN, size));
        jBtraducir.setFont(new Font(f, Font.PLAIN, size));
        jBInvertir.setFont(new Font(f, Font.PLAIN, size));
        jTituloComun.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTableComun.setFont(new Font(f, Font.PLAIN, size));
        jTituloSize.setFont(new Font("Tahoma", Font.BOLD, 18));
        jTituloFont.setFont(new Font("Tahoma", Font.BOLD, 18));
        jComboSize.setFont(new Font(f, Font.PLAIN, size));
        jMuestra.setFont(new Font(f, Font.PLAIN, size));
        jBValidar.setFont(new Font(f, Font.PLAIN, size));
        jBColorF.setFont(new Font(f, Font.PLAIN, size));
        jBColorB.setFont(new Font(f, Font.PLAIN, size));
        jBColorL.setFont(new Font(f, Font.PLAIN, size));
        jTituloIdioma.setFont(new Font("Tahoma", Font.BOLD, 18));
        jBGuardar.setFont(new Font(f, Font.PLAIN, size));
    }

    public void modMuestra(String f, Integer size) {
        jMuestra.setFont(new Font(f, Font.PLAIN, size));
    }

    public void cambiarTexto(String f, Integer size) {

        //MenuBar
        jTraductorMenu.setFont(new Font(f, Font.PLAIN, size));
        jComunesMenu.setFont(new Font(f, Font.PLAIN, size));
        jAdminMenu.setFont(new Font(f, Font.PLAIN, size));
        jConfigMenu.setFont(new Font(f, Font.PLAIN, size));
        jIdiomaMenu.setFont(new Font(f, Font.PLAIN, size));
        //Traductor
        jTituloTraducir.setFont(new Font(f, Font.PLAIN, size + 2));
        jTTraducir.setFont(new Font(f, Font.PLAIN, size));
        jTituloTraducido.setFont(new Font(f, Font.PLAIN, size + 2));
        jTTraducido.setFont(new Font(f, Font.PLAIN, size));
        jCIdioma.setFont(new Font(f, Font.PLAIN, size));
        jBtraducir.setFont(new Font(f, Font.PLAIN, size));
        jBInvertir.setFont(new Font(f, Font.PLAIN, size));
        //Comunes
        jTituloComun.setFont(new Font(f, Font.PLAIN, size + 2));
        jTableComun.setFont(new Font(f, Font.PLAIN, size));
        //Config
        jTituloSize.setFont(new Font(f, Font.PLAIN, size + 2));
        jTituloFont.setFont(new Font(f, Font.PLAIN, size + 2));
        jComboSize.setFont(new Font(f, Font.PLAIN, size));
        jBValidar.setFont(new Font(f, Font.PLAIN, size));
        jMuestra.setFont(new Font(f, Font.PLAIN, size));
        jBColorF.setFont(new Font(f, Font.PLAIN, size));
        jBColorB.setFont(new Font(f, Font.PLAIN, size));
        jBColorL.setFont(new Font(f, Font.PLAIN, size));
        //Idioma
        jTituloIdioma.setFont(new Font(f, Font.PLAIN, size + 2));
        jBGuardar.setFont(new Font(f, Font.PLAIN, size));

    }

    public void cambiarColorFondo(Color c) {

        jConfig.setBackground(c);
        jPComunes.setBackground(c);
        jPTraductor.setBackground(c);
        jIdioma.setBackground(c);

    }

    public void cambiarColorBotones(Color c) {

        //Traductor
        jBtraducir.setBackground(c);
        jBInvertir.setBackground(c);
        //Config
        jBColorF.setBackground(c);
        jBColorB.setBackground(c);
        jBColorL.setBackground(c);
        jBValidar.setBackground(c);
        //Idioma
        jBGuardar.setBackground(c);
    }

    public void cambiarColorLetras(Color c) {
        
       //MenuBAR
jTraductorMenu.setForeground(c);
jComunesMenu.setForeground(c);
jAdminMenu.setForeground(c);
jConfigMenu.setForeground(c);
jIdiomaMenu.setForeground(c);
//Traductor
jTituloTraducir.setForeground(c);
jTTraducir.setForeground(c);
jTituloTraducido.setForeground(c);
jTTraducido.setForeground(c);
jCIdioma.setForeground(c);
jBtraducir.setForeground(c);
jBInvertir.setForeground(c);
//Comunes
jTituloComun.setForeground(c);
jTableComun.setForeground(c);
//Config
jTituloSize.setForeground(c);
jTituloFont.setForeground(c);
jComboSize.setForeground(c);
jMuestra.setForeground(c);
jBValidar.setForeground(c);
jBColorF.setForeground(c);
jBColorB.setForeground(c);
jBColorL.setForeground(c);
//Idioma
jTituloIdioma.setForeground(c);
jBGuardar.setForeground(c);

    }

    // Crea una fuente
    public void CustomFont(String fuente) {

        String fontName = fuente;

        try {
            //Se carga la fuente
//            InputStream is =  getClass().getResourceAsStream(fontName);
//            font = Font.createFont(Font.TRUETYPE_FONT, is);
            font = Font.createFont(Font.TRUETYPE_FONT, new File("src/fonts/" + fontName + ".ttf"));
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
