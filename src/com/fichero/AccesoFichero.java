package com.fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AccesoFichero {

    FileWriter fw;
    public static ArrayList<String> lPassword=new ArrayList();

    public void leerFichero() {

        // A prueba de errores de carga de datos desde un Fichero ("\\s*,\\s*") para que lea espacios
        try {
            // Usar el delimitador que queramos

            // WIndows
            //      Scanner sc = new Scanner(new File("D:\\NeatBeansProjects\\Boletin20\\src\\fichero\\flibros.txt"));
            // Linux
            Scanner sc=new Scanner(new File("src/BaseDatos/usuarios.txt"));
            while (sc.hasNextLine()) {
                lPassword.add(sc.nextLine());
            }

            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Erro2"+ex.getMessage());
        }

    }

    public ArrayList<String> importLPassword() {
        return lPassword;
    }



//    public void escribirFichero() {
//
//    }
}
