package com.metodos;

import com.fichero.*;
import com.menus.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {
    
     // Variable INICIO
    AccesoFichero objAcces=new AccesoFichero();
    private ArrayList<String> lPassword=objAcces.importLPassword();
    
    // Variable MENU
    public static boolean bAdmin;

    // Metodo INICIO
    public Boolean validarEntrada(String password) {
        
        Iterator it=AccesoFichero.lPassword.iterator();
        while (it.hasNext()) {
            if (it.next().equals(password)) {
                System.out.println("hola");
                bAdmin=true;
                
                return true;
                
            }
        }
        return false;
    }

    // Metodo MENU
    
    public static void prueba(){
        Menus obj = new Menus();
       obj.revalidate();
    }
}
