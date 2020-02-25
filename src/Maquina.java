import java.util.ArrayList;

/* Nombres: Lucas Fernández Cedrón y Javier Vidaurreta Castillo
    Nombre del fichero: Maquina.java
    Descripción: Partida del Cinquillo*/

public class Maquina extends Jugador{

	//Constructor
	public Maquina(String n){
		this.mano= new ArrayList<Carta>();
		this.nombre=n;
	}
	
	//Metodos
	public Carta elegirCarta(Mesa m){
		System.out.println(" ");
		System.out.println("Turno de " + this.nombre);
		Carta c=new Carta("",0);
		for(int i=0; i<this.numCartas(); i++){
			if(m.puedoColocarCarta(mano.get(i))){
				if(mano.get(i).getNumero()>c.getNumero()){
					c=mano.get(i);
				}
			}
		}
		return c;
	}
}
