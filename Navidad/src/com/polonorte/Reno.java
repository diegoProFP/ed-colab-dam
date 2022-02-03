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
    private int numCollares;
    /**
     * Metodo para que un reno se ponga a volar
     * @param direccion La direccion a la que tiene que ir el reno
     * @return El grito de guerra que devuelve el reno
     */
    public String volar(String direccion){
        System.out.println("Reno.volar DIEGO");

        System.out.println("Reno volando");//comment
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}

	public int getNumCollares() {
		return numCollares;
	}

	public void setNumCollares(int numCollares) {
		this.numCollares = numCollares;
	}

    

}
