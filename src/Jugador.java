
/* Nombres: Lucas Fernández Cedrón y Javier Vidaurreta Castillo
    Nombre del fichero: Jugador.java
    Descripción: Partida del Cinquillo*/

import java.util.ArrayList;

public abstract class Jugador {

	//Atributos
	protected ArrayList<Carta> mano;
	protected String nombre;
	
	//Metodos
	public abstract Carta elegirCarta(Mesa m);
	
	public boolean sePuedeJugar(Mesa m){
		for(int i=0; i<numCartas(); i++){
			if(m.puedoColocarCarta(mano.get(i))){
				return(true);
			}
		}
		return(false);
	}
	
	public void anadirCarta(Carta c){
		mano.add(c);
	}
	
	public void quitarCarta(Carta c){
		mano.remove(c);
	}
	
	
	public String getNombre(){
		return (this.nombre);
	}
	
	public int numCartas(){
		return(mano.size());
	}
	
	public boolean sinCartas(){
		if(this.numCartas()==0){
			return(true);
		}
		return(false);
	}
}
