package com.fichero;

import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.poi.poifs.eventfilesystem.POIFSReader;
import org.apache.poi.poifs.filesystem.FileMagic;

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

    public void leerFichero() {

        try {

            Scanner scU = new Scanner(new File("src/BaseDatos/usuarios.txt"));
            while (scU.hasNextLine()) {
                lPassword.add(scU.nextLine());
            }

            scU.close();

            Scanner scM = new Scanner(new File("src/BaseDatos/morse.txt"));
            while (scM.hasNextLine()) {
                arrayMorse = scM.nextLine().split("\\s* | \\s*");
                objM = new Morse(arrayMorse[0], arrayMorse[2]);
                lMorse.add(objM);
            }

            scM.close();

            Scanner scP = new Scanner(new File("src/BaseDatos/palabras.txt"));
            while (scP.hasNextLine()) {
                arrayPC = scP.nextLine().split("\\|");
                objPC = new Palabras_Comunes(arrayPC[0], arrayPC[1]);
                lPComunes.add(objPC);
            }

            scP.close();

            Scanner scI = new Scanner(new File("src/BaseDatos/idiomas.txt"));
            while (scI.hasNextLine()) {
                lIdiomas.add(scI.nextLine());
            }

            scP.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Erro2" + ex.getMessage());
        }

    }

    public void modFicheroIdiomas(String nomFichero) {
       
         Iterator<String> it = lIdiomas.iterator();
     
        BufferedWriter bw;
        FileWriter fw;

            try {
                fw = new FileWriter(new File("src/BaseDatos/idiomas.txt"), true);
                while (it.hasNext()) {
                    fw.write(it.next()+"\n");
                }

                fw.close();
            } catch (IOException ex) {
                System.out.println("Error 4");
            }
        

    }

    // BORRAR
    public static void abrir() {

//ruta del archivo en el pc
//String file = new String("E:\\pruebaArchivo\\ArchivoPrueba.xlsx"); 
//rutal del archivo desde el src del proyecto
        String fileLocal = new String("src/BaseDatos/A.doc");
        try {

            // Valido solo para Windows
//            Runtime.getRuntime().exec("cmd /c start "+fileLocal);
            // Valido para todos los Sistemas Operativos
            File path = new File(fileLocal);
            Desktop.getDesktop().open(path);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

}
