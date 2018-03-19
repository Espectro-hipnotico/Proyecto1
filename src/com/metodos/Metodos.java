package com.metodos;

import com.fichero.*;
import com.menus.Menus;
import static com.menus.Menus.jPrueba;
import static com.menus.Menus.jTAreaTraducido;
import static com.menus.Menus.jTTraducir;
import static com.menus.Menus.jTable;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

import javax.swing.table.DefaultTableModel;

public class Metodos {

    Visual objV = new Visual();
    AccesoFichero objAcces = new AccesoFichero();

    // Para modificar carga el modelo de la tabla del jPanelComunes
    DefaultTableModel modelolista = new DefaultTableModel();

    // Variable INICIO    
    private ArrayList<String> lPassword = AccesoFichero.lPassword;

    // Variable MENU Morse
    private ArrayList<Morse> lMorse = AccesoFichero.lMorse;
    public static boolean bAdmin;

    // Variable MENU Comunes
    private ArrayList<Palabras_Comunes> lPComunes = AccesoFichero.lPComunes;

    // Variable MENU Traductor
    private ArrayList<String> lIdiomas = AccesoFichero.lIdiomas;

    // Metodo INICIO
    public Boolean validarEntrada(String password) {

        Iterator it = AccesoFichero.lPassword.iterator();
        while (it.hasNext()) {
            if (it.next().equals(password)) {
                System.out.println("hola");
                bAdmin = true;

                return true;

            }
        }
        return false;
    }

    // Limpia las cajas de Texto del metodo MENU
    public void limpiar() {
        Menus.jTAreaTraducido.setText(null);
        Menus.jTTraducir.setText(null);
    }

    public void traductor(Object idioma, Boolean condicion) {

        for (String auxIdioma : AccesoFichero.lIdiomas) {
            if (idioma.equals(auxIdioma)) {
                objV.CustomFont(auxIdioma);

            }
        }

        if (condicion == false) {
            jTAreaTraducido.setFont(objV.MyFont(0, jPrueba.getFont().getSize()));
            jTTraducir.setFont(jPrueba.getFont());
            jTAreaTraducido.setText(jTTraducir.getText());
        } else {
            jTTraducir.setFont(objV.MyFont(0, jPrueba.getFont().getSize()));
            jTAreaTraducido.setFont(jPrueba.getFont());
            jTAreaTraducido.setText(jTTraducir.getText());
        }

    }

    // Metodo para traducir a MORSE y VICEVERSA
    public String traduciraMorse(String texto, Boolean condicion) {
        String cadena = "";
        Boolean encontrada;

        // TEXTO a MORSE
        if (condicion == false) {
            for (int i = 0; i < texto.length(); i++) {
                String refuerzo = String.valueOf(texto.charAt(i));
                encontrada = false;
                for (Morse aux : AccesoFichero.lMorse) {
                    if (aux.getLetra().equalsIgnoreCase(refuerzo)) {
                        cadena += aux.getCodigo() + " ";
                        encontrada = true;
                    }
                }
                if (encontrada == false) {
                    cadena += "  ";
                }

            }
            // MORSE a TEXTO
        } else {
            String[] refuerzo = texto.split(" ");
            for (int i = 0; i < refuerzo.length; i++) {

                encontrada = false;
                for (Morse aux : AccesoFichero.lMorse) {
                    if (aux.getCodigo().equalsIgnoreCase(refuerzo[i])) {
                        cadena += aux.getLetra() + "  ";
                        encontrada = true;
                    }
                }
                if (encontrada == false) {
                    cadena += "  ";
                }

            }
        }

        return cadena;
    }
    // Llena la tabla del MENU con del JPANEL Palabras Comunes

    public void llenarTabla() {

        String matriz[][] = new String[lPComunes.size()][2];

        for (int i = 0; i < AccesoFichero.lPComunes.size(); i++) {
            matriz[i][0] = AccesoFichero.lPComunes.get(i).getPalabra();
            matriz[i][1] = AccesoFichero.lPComunes.get(i).getCodigo();

        }

        jTable.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Palabra", "Morse"
                }
        ) {// Bloquea que las columnas se puedan editar, haciendo doble click en ellas
            @SuppressWarnings("rawtypes")
            Class[] columnTypes = new Class[]{
                String.class, String.class
            };

            @SuppressWarnings({"unchecked", "rawtypes"})
            @Override
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
            boolean[] columnEditables = new boolean[]{
                false, false
            };

            @Override
            public boolean isCellEditable(int row, int column) {
                return columnEditables[column];
            }
        });

    }

    // Metodo para cargar los numeros meterlos en Combo Box del panel Configuración y
    //agregamos todas las fuentes de nuestro sistema en nuestro JLista
    public void cargarComponentes(DefaultListModel dlm, String[] fuentes) {
        for (int i = 10; i <= 30; i++) {
            Menus.jComboSize.addItem(String.valueOf(i));
        }
        for (String fuente : fuentes) {
            dlm.addElement(fuente);
        }

    }

    // Carga la lista de idiomas disponibles
    public void cargaJCIdiomas() {
        for (String idioma : lIdiomas) {
            Menus.jCIdioma.addItem(idioma);
        }
    }

    // Me permite copiar un archivo desde el ordenador a la ubicación del programa que yo quiera
    public  void copyFileUsingFileChannels(File source, String path) {

        FileChannel inputChannel = null;

        FileChannel outputChannel = null;
        String nombreExten = source.getName();
        try {

            inputChannel = new FileInputStream(path).getChannel();
            outputChannel = new FileOutputStream("src/fonts/" + nombreExten).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                inputChannel.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                outputChannel.close();
            } catch (IOException ex) {
                Logger.getLogger(Metodos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

         AccesoFichero.lIdiomas.add(nombreExten);
         objAcces.modFicheroIdiomas(nombreExten);
         
         String[] nombre=nombreExten.split("\\.");
         Menus.jCIdioma.addItem(nombre[0]);

    }

}
