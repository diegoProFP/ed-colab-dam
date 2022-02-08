package com.polonorte;

import java.util.List;

/**
 * Clase que representa un <i>trineo de navidad</i>
 * @author Diego
 * @version 1.0
 */
public class Trineo {

    private int numAsientos;
    private int peso;
    private int volumenRegalos;
    private List<String> bolsaRegalos;
    public static void main(String[] args) {
        String paco= "aaaa";
        System.out.println("Clase Trineo.main");
        Reno rudolf = new Reno();
        rudolf.volar("pallá");
    }

    /**
     * @see com.polonorte.Reno
     */
    private List<Reno> renos;

    /**
     * Mete un regalo dentro de la bolsa
     * @param regalo El regalo a meter en la lista
     * @return El resultado de añadir el regalo a la lista
     * @since 1.0
     */
    public boolean meterRegalo(String regalo){
        return this.bolsaRegalos.add(regalo);
    }

    /**
     * Incluye un reno en la lista de renos del trineo
     * @param uno  El reno a incluir
     * @return El resultado de añadir el reno a la lista
     * @see com.polonorte.Reno
     */
    public boolean incluirReno(Reno uno){
        return this.renos.add(uno);

    }


    /**
     * Metodo para calcular si un niño/a ha sido bueno, por lo tanto merece o no regalo.
     * @param nombre El nombre del niño/a
     * @param numeroPeleas La cantidad de peleas en las que ha estado involucrado
     * @param vecesGracias El numero de veces que ha dicho <i>gracias</i>
     * @param vecesPorFavor El numero de veces que ha dicho <i>por favor</i>
     * @return True si merece regalo, false en caso contrario
     */
    public boolean mereceRegalo(String nombre, int numeroPeleas, int vecesGracias, int vecesPorFavor) {
    	
	    boolean haSidoBueno = false;
	    
	    if(numeroPeleas == 0) {
	    	haSidoBueno = true;
	    }else if(numeroPeleas > 0 && vecesGracias > 10 && vecesPorFavor > 8) {
	    	haSidoBueno = true;
	    }else {
	    	haSidoBueno = false;
	    }
	    
	    return haSidoBueno;
	}


}
