
package com.fichero;

public class Palabras_Comunes {
    private String palabra;
    private String codigo;

    public Palabras_Comunes(String palabra, String codigo) {
        this.palabra = palabra;
        this.codigo = codigo;
    }

    public String getPalabra() {
        return palabra;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return  "palabra: " + palabra + " codigo: " + codigo;
    }
    
    
}
