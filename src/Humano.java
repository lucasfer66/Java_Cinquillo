
/* Nombres: Lucas Fernández Cedrón y Javier Vidaurreta Castillo
    Nombre del fichero: Humano.java
    Descripción: Partida del Cinquillo*/

import java.util.ArrayList;
import java.util.Scanner;

public class Humano extends Jugador{

	//Constructor
	public Humano(String n){
		this.mano= new ArrayList<Carta>();
		this.nombre=n;
	}
	
	//Metodos
	public Carta elegirCarta(Mesa m){
		System.out.println(" ");
		System.out.println("Turno de " + this.nombre);
		System.out.println("CARTAS QUE PUEDES COLOCAR: ");
		for(int i=0; i<this.numCartas(); i++){
			if(m.puedoColocarCarta(mano.get(i))){
				System.out.println("Carta nº" + i + ":");
				mano.get(i).Mostrar();
			}
		}
		System.out.println("");
		System.out.println("¿Qué numero de carta quieres colocar?");
		int opcion;
		Scanner sc=new Scanner(System.in);
		opcion=sc.nextInt();
		return(mano.get(opcion));
	}
}
