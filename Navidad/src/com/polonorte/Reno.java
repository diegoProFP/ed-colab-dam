package com.polonorte;

/**
 * Clase que representa un reno
 * @author Diego
 *
 * @version 1.0
 */
public class Reno {

    private String nombre;
    private int velocidad;

    private int numCuernos;
    /**
     * Metodo para que un reno se ponga a volar
     * @param direccion La direccion a la que tiene que ir el reno
     * @return El grito de guerra que devuelve el reno
     */
    public String volar(String direccion){
        System.out.println("Reno.volar");

        System.out.println("Reno volando");
        return "mmmmmiiiiii chus chus peeeeerrrr";
    }

    /**
     * Metodo que hace correr a este reno hacia una direccion
     * @deprecated Deprecado desde la version 0.5, mejor usar {@link #volar(String)}
     * @param direccion Direccion a la que tiene que ir el reno
     */
    public void correr(String direccion){
        //TODO terminar
    }


}
