package com.metodos;

import com.fichero.*;
import com.menus.Menus;
import static com.menus.Menus.jTable;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class Metodos {

    // Para modificar carga el modelo de la tabla del jPanelComunes
    DefaultTableModel modelolista = new DefaultTableModel();

    // Variable INICIO    
    private ArrayList<String> lPassword = AccesoFichero.lPassword;

    // Variable MENU Morse
    private ArrayList<Morse> lMorse = AccesoFichero.lMorse;
    public static boolean bAdmin;

    // Variable MENU Comunes
    private ArrayList<Palabras_Comunes> lPComunes = AccesoFichero.lPComunes;

    // Metodo INICIO
    public Boolean validarEntrada(String password) {

        Iterator it = lPassword.iterator();
        while (it.hasNext()) {
            if (it.next().equals(password)) {
                System.out.println("hola");
                bAdmin = true;

                return true;

            }
        }
        return false;
    }

    // Metodo MENU
    public void limpiar() {
        Menus.jTAreaTraducido.setText(null);
        Menus.jTTraducir.setText(null);
    }

    public String traduciraMorse(String texto, Boolean condicion) {
        String cadena = "";
        Boolean encontrada;
        if (condicion == false) {
            for (int i = 0; i < texto.length(); i++) {
                String refuerzo = String.valueOf(texto.charAt(i));
                encontrada = false;
                for (Morse aux : lMorse) {
                    if (aux.getLetra().equalsIgnoreCase(refuerzo)) {
                        cadena += aux.getCodigo() + " ";
                        encontrada = true;
                    }
                }
                if (encontrada == false) {
                    cadena += "  ";
                }

            }

        } else {
            String[] refuerzo = texto.split(" ");
            for (int i = 0; i < refuerzo.length; i++) {
                
                encontrada = false;
                for (Morse aux : lMorse) {
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

    public void llenarTabla() {

        String matriz[][] = new String[lPComunes.size()][2];

        for (int i = 0; i < lPComunes.size(); i++) {
            matriz[i][0] = lPComunes.get(i).getPalabra();
            matriz[i][1] = lPComunes.get(i).getCodigo();

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

}
