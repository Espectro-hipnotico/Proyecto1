package com.fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AccesoFichero {

    FileWriter fw;
    public static ArrayList<String> lPassword = new ArrayList();
    public static ArrayList<Morse> lMorse = new ArrayList();
    public static ArrayList<Palabras_Comunes> lPComunes = new ArrayList();
    // objeto Morse
    Morse objM;
    // Array String
    String[] ArrayMorse;
    // objeto Palabras_Comunes
    Palabras_Comunes objPC;
    // Array String
    String[] ArrayPC;

    public void leerFichero() {

        // A prueba de errores de carga de datos desde un Fichero ("\\s*,\\s*") para que lea espacios
        try {
            // WIndows
            //      Scanner sc = new Scanner(new File("D:\\NeatBeansProjects\\Boletin20\\src\\fichero\\flibros.txt"));
            // Linux
            Scanner scU = new Scanner(new File("src/BaseDatos/usuarios.txt"));
            while (scU.hasNextLine()) {
                lPassword.add(scU.nextLine());
            }

            scU.close();

            Scanner scM = new Scanner(new File("src/BaseDatos/morse.txt"));
            while (scM.hasNextLine()) {
                ArrayMorse = scM.nextLine().split("\\s* | \\s*");
                objM = new Morse(ArrayMorse[0], ArrayMorse[2]);
                lMorse.add(objM);
            }

            scM.close();

            Scanner scP = new Scanner(new File("src/BaseDatos/palabras.txt"));
            while (scP.hasNextLine()) {
                ArrayPC = scP.nextLine().split("\\|");
                objPC = new Palabras_Comunes(ArrayPC[0], ArrayPC[1]);
                lPComunes.add(objPC);
            }

            scP.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Erro2" + ex.getMessage());
        }

    }

//    public void escribirFichero() {
//
//    }
}
