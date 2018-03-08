package com.metodos;

import com.fichero.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {

    // Variable INICIO
    AccesoFichero objAcces = new AccesoFichero();
    private ArrayList<String> lPassword = AccesoFichero.lPassword;

    // Variable MENU
    private ArrayList<Morse> lMorse = AccesoFichero.lMorse;
    public static boolean bAdmin;

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
    public void prueba(String texto) {
        Iterator it = lMorse.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());

        }

        char[] l = texto.toCharArray();
        System.out.print(texto);
        System.out.println(l[0]);
    }

    public String traduciraMorse(String texto) {
        String cadena = "";
        
        for (int i = 0; i < texto.length(); i++) {
            String refuerzo = String.valueOf(texto.charAt(i));

            for (Morse aux : lMorse) {
                if (aux.getLetra().equalsIgnoreCase(refuerzo)) {
                    cadena += aux.getCodigo();
                }
            }

        }
        return cadena;

    }

}
