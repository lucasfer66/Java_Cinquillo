
/* Nombres: Lucas Fernández Cedrón y Javier Vidaurreta Castillo
    Nombre del fichero: Partida.java
    Descripción: Partida del Cinquillo*/

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {

	//Atributos
	private Mesa mesa;
	private ArrayList<Jugador> jugadores;
	int numHumanos;
	int numMaquinas;
	
	//Constructor
	public Partida(int h, int m){
		this.mesa= new Mesa();
		this.jugadores= new ArrayList<Jugador>();
		this.numHumanos=h;
		this.numMaquinas=m;
		for(int i=1; i<=h; i++){
			String n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Introducir el nombre del jugador " + i);
			n=sc.nextLine();
			this.jugadores.add(new Humano(n));
		}
		for(int i=1; i<=m; i++){
			this.jugadores.add(new Maquina("Maquina" + i));
			System.out.println("Añadida Maquina " + i);
		}
	}
	
	//Metodos
	public void iniciarPartida(){
		mesa.anadirCartas();

		int numCartas= 40/(this.numHumanos+this.numMaquinas);
		if(numCartas>10){
			numCartas=10;
		}
		for(int n=0; n<jugadores.size();n++){
			for(int i=0;i<numCartas;i++){
				jugadores.get(n).anadirCarta(mesa.extraerCarta());
			}
		}
	}
	
	public boolean partidaFinalizada(){
		for(int n=0; n<jugadores.size();n++){
			if(jugadores.get(n).sinCartas()){
				return (true);
			}
		}
		return (false);
	}
	
	public Jugador getGanador(){
		for(int n=0; n<jugadores.size();n++){
			if(jugadores.get(n).sinCartas()){
				return (jugadores.get(n));
			}
		}
		return (null);
	}
	
	public void Clasificacion(){
		System.out.println("El ganador es: " + this.getGanador().getNombre());
		for(int i=0; i<(this.numHumanos+this.numMaquinas);i++){
			System.out.println("Al jugador: " + this.jugadores.get(i).getNombre()+" le quedan "+this.jugadores.get(i).numCartas()+" cartas.");
		}
	}
	
	public void realizarJugada(){
		for(int i=0; i<(this.numHumanos+this.numMaquinas);i++){
			if(this.jugadores.get(i).sePuedeJugar(mesa)){
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Las cartas colocadas en la mesa: ");
				System.out.println(" ");
				this.mesa.mostrarMesa();
				Carta c=this.jugadores.get(i).elegirCarta(mesa);
				this.jugadores.get(i).quitarCarta(c);
				mesa.colocarCarta(c);
			}
			else{
				System.out.println("");
				System.out.println("El jugador "+ this.jugadores.get(i).getNombre()+" no puede colocar carta, roba.");
				this.jugadores.get(i).anadirCarta(mesa.extraerCarta());
			}
		}
	}
}
