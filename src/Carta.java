
/* Nombres: Lucas Fern�ndez Cedr�n y Javier Vidaurreta Castillo
    Nombre del fichero: Carta.java
    Descripci�n: Partida del Cinquillo*/

public class Carta {

	//Atributos
	private String palo;
	private int numero;
	
	//Constructor
	public Carta(String palo, int numero){
		this.palo=palo;
		this.numero=numero;
	}
	
	//Metodos
	public String getPalo(){
		return(this.palo);
	}
	
	public int getNumero(){
		return(this.numero);
	}
	
	public String toString(){
		return("|" + this.getNumero() + " " + this.getPalo() + "|");
	}
	
	public void Mostrar(){
		System.out.println(this.toString());
	}
}
