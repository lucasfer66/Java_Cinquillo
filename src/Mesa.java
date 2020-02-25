
/* Nombres: Lucas Fernández Cedrón y Javier Vidaurreta Castillo
    Nombre del fichero: Mesa.java
    Descripción: Partida del Cinquillo*/

import java.util.ArrayList;
import java.util.Random;

public class Mesa {

	//Atributos
	private ArrayList<Carta> monton;
	private int CartasARobar;
	private DobleCola<Carta> oros;
	private DobleCola<Carta> espadas;
	private DobleCola<Carta> bastos;
	private DobleCola<Carta> copas;
	
	//Constructor
	public Mesa(){
		this.monton= new ArrayList<Carta>();
		this.oros=new DobleCola();
		this.espadas=new DobleCola();
		this.bastos=new DobleCola();
		this.copas=new DobleCola();
	}
	
	//Metodos
	public void anadirCartas(){
		for(int i=1; i<11; i++){
			this.monton.add( new Carta("oros", i));
		}
		for(int i=1; i<11; i++){
			this.monton.add( new Carta("espadas", i));
		}
		for(int i=1; i<11; i++){
			this.monton.add( new Carta("bastos", i));
		}
		for(int i=1; i<11; i++){
			this.monton.add( new Carta("copas", i));
		}
	}
	
	public Carta extraerCarta(){
		Random rnd= new Random();
		return(monton.remove(rnd.nextInt(monton.size())));
	}
	
	public void colocarCarta(Carta carta){
		if("oros".equals(carta.getPalo())==true){
			if(carta.getNumero()==5){
				oros.anadirPrincipio(carta);
			}
			else if(carta.getNumero()==this.oros.getPrimero().getNumero()-1){
				oros.anadirPrincipio(carta);
			}
			else if(carta.getNumero()==this.oros.getUltimo().getNumero()+1){
				oros.anadirFinal(carta);
			}
		}
		if("espadas".equals(carta.getPalo())==true){
			if(carta.getNumero()==5){
				espadas.anadirPrincipio(carta);
			}
			else if(carta.getNumero()==this.espadas.getPrimero().getNumero()-1){
				espadas.anadirPrincipio(carta);
			}
			else if(carta.getNumero()==this.espadas.getUltimo().getNumero()+1){
				espadas.anadirFinal(carta);
			}
		}
		if("bastos".equals(carta.getPalo())==true){
			if(carta.getNumero()==5){
				bastos.anadirPrincipio(carta);
			}
			else if(carta.getNumero()==this.bastos.getPrimero().getNumero()-1){
				bastos.anadirPrincipio(carta);
			}
			else if(carta.getNumero()==this.bastos.getUltimo().getNumero()+1){
				bastos.anadirFinal(carta);
			}
		}
		if("copas".equals(carta.getPalo())==true){
			if(carta.getNumero()==5){
				copas.anadirPrincipio(carta);
			}
			else if(carta.getNumero()==this.copas.getPrimero().getNumero()-1){
				copas.anadirPrincipio(carta);
			}
			else if(carta.getNumero()==this.copas.getUltimo().getNumero()+1){
				copas.anadirFinal(carta);
			}
		}
	}
	
	public boolean montonVacio(){
		if(CartasARobar==0){
			return(true);
		}
		return(false);
	}
	
	public boolean puedoColocarCarta(Carta carta){
		if(carta.getNumero()==5){
			return(true);
		}
		if("oros".equals(carta.getPalo())==true){
			if(this.oros.estaVacia()==true){
				return(false);
			}
			if(carta.getNumero()==this.oros.getPrimero().getNumero()-1){
				return(true);
			}
			if(carta.getNumero()==this.oros.getUltimo().getNumero()+1){
				return(true);
			}
		}
		if("espadas".equals(carta.getPalo())==true){
			if(this.espadas.estaVacia()==true){
				return(false);
			}
			if(carta.getNumero()==this.espadas.getPrimero().getNumero()-1){
				return(true);
			}
			if(carta.getNumero()==this.espadas.getUltimo().getNumero()+1){
				return(true);
			}
		}
		if("bastos".equals(carta.getPalo())==true){
			if(this.bastos.estaVacia()==true){
				return(false);
			}
			if(carta.getNumero()==this.bastos.getPrimero().getNumero()-1){
				return(true);
			}
			if(carta.getNumero()==this.bastos.getUltimo().getNumero()+1){
				return(true);
			}
		}
		if("copas".equals(carta.getPalo())==true){
			if(this.copas.estaVacia()==true){
				return(false);
			}
			if(carta.getNumero()==this.copas.getPrimero().getNumero()-1){
				return(true);
			}
			if(carta.getNumero()==this.copas.getUltimo().getNumero()+1){
				return(true);
			}
		}
		return(false);
	}
	
	public void mostrarMesa(){
		System.out.println("La columna de los oros: ");
		oros.mostrarCola();
		System.out.println("La columna de las espadas: ");
		espadas.mostrarCola();
		System.out.println("La columna de los bastos: ");
		bastos.mostrarCola();
		System.out.println("La columna de las copas: ");
		copas.mostrarCola();
	}
	
	public void mostrarExtremos(){
		System.out.println("Los extremos de los oros: ");
		oros.getPrimero().Mostrar();
		oros.getUltimo().Mostrar();
		System.out.println("Los extremos de las espadas: ");
		espadas.getPrimero().Mostrar();
		espadas.getUltimo().Mostrar();
		System.out.println("Los extremos de los bastos: ");
		bastos.getPrimero().Mostrar();
		bastos.getUltimo().Mostrar();
		System.out.println("Los extremos de las copas: ");
		copas.getPrimero().Mostrar();
		copas.getUltimo().Mostrar();
	}
}
