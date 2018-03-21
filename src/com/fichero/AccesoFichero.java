package com.fichero;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AccesoFichero {

    FileWriter fw;
    public static ArrayList<String> lPassword = new ArrayList();
    public static ArrayList<Morse> lMorse = new ArrayList();
    public static ArrayList<Palabras_Comunes> lPComunes = new ArrayList();
    public static ArrayList<String> lIdiomas = new ArrayList();
    // objeto Morse
    Morse objM;
    // Array String
    String[] arrayMorse;
    // objeto Palabras_Comunes
    Palabras_Comunes objPC;
    // Array String
    String[] arrayPC;
    // Array Comun
    String[] arrayGenerico;

    /**
     * Lee los ficheros
     */
    public void leerFichero() {

        try {

            Scanner scU = new Scanner(new File("src/baseDatos/usuarios.txt"));
            while (scU.hasNextLine()) {
                lPassword.add(scU.nextLine());
            }

            scU.close();

            Scanner scM = new Scanner(new File("src/baseDatos/morse.txt"));
            while (scM.hasNextLine()) {
                arrayMorse = scM.nextLine().split("\\s* | \\s*");
                objM = new Morse(arrayMorse[0], arrayMorse[2]);
                lMorse.add(objM);
            }

            scM.close();

            Scanner scP = new Scanner(new File("src/baseDatos/palabras.txt"));
            while (scP.hasNextLine()) {
                arrayPC = scP.nextLine().split("\\|");
                objPC = new Palabras_Comunes(arrayPC[0], arrayPC[1]);
                lPComunes.add(objPC);
            }

            scP.close();

            Scanner scI = new Scanner(new File("src/baseDatos/idiomas.txt"));
            while (scI.hasNextLine()) {
                lIdiomas.add(scI.nextLine());
            }

            scP.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Erro2" + ex.getMessage());
        }

    }

    /**
     * Guarda el fichero idioma si se agrega alguno
     */
    public void modFicheroIdiomas() {

        Iterator<String> it = lIdiomas.iterator();

        BufferedWriter bw;
        FileWriter fw;

        try {
            fw = new FileWriter(new File("src/baseDatos/idiomas.txt"));
            while (it.hasNext()) {

                fw.write(it.next() + "\n");
            }

            fw.close();
        } catch (IOException ex) {
            System.out.println("Error 4");
        }

    }
}
