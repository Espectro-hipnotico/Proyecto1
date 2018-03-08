
package com.fichero;


public class Morse {
    private String letra;
    private String codigo;

    public Morse(String letra, String codigo) {
        this.letra = letra;
        this.codigo = codigo;
    }

    public String getLetra() {
        return letra;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return  "letra=" + letra + ", codigo=" + codigo;
    }
    
    
    
    
}
