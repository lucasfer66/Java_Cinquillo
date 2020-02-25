
/* Nombres: Lucas Fernández Cedrón y Javier Vidaurreta Castillo
    Nombre del fichero: Partida.java
    Descripción: Partida del Cinquillo*/

import java.util.Scanner;

public class Principal {

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int numHumanos;
		int numMaquinas;
		
		System.out.println("¿Cuantos humanos deseas?");
		numHumanos=sc.nextInt();
		
		System.out.println("¿Cuantos máquinas deseas?");
		numMaquinas=sc.nextInt();
		
		Partida p=new Partida(numHumanos, numMaquinas);
		p.iniciarPartida();
		while(p.partidaFinalizada()!=true){
			p.realizarJugada();
		}
		p.Clasificacion();
	}
}
