
/* Nombres: Lucas Fernández Cedrón y Javier Vidaurreta Castillo
    Nombre del fichero: DobleCola.java
    Descripción: Partida del Cinquillo*/

public class DobleCola<T> {

	//Atributos
	private T[] datos;
	private int ultimo, primero, num;
	private static final int MAX=10;
	
	
	//Constructor
	public DobleCola(){
		this.primero=0;
		this.ultimo=9;
		this.datos=(T[]) new Object[MAX];
		this.num=0;
	}
	
	//Metodos
	public T getPrimero(){
		return (this.datos[primero]);
	}
	
	
	public T getUltimo(){
		return (this.datos[ultimo]);
	}
	
	public void anadirPrincipio(T t){
		if((this.primero!=0)&& (num<MAX)){
			this.datos[primero-1]=t;
			primero--;
			num++;
		}
		if((this.primero==0)&&(num<MAX)){
			this.datos[MAX-1]=t;
			primero=MAX-1;
			num++;
		}
		if(num==1){
			ultimo=primero;
		}
		
	}

	
	public void anadirFinal(T t){
		if((this.ultimo!=9)&& (num<MAX)){
			this.datos[ultimo+1]=t;
			ultimo++;
			num++;
			}
		if((this.ultimo==9)&&(num<MAX)){
			this.datos[0]=t;
			ultimo=0;
			num++;
			}	
	}
	
	public void eliminarPrincipio(){
		if(this.primero!=MAX){
			this.primero++;
			}
		else{
			this.primero=0;
			}
	}
	
	public void eliminarFinal(){
		if(this.ultimo!=0){
			this.ultimo--;
			}
		else{
			this.ultimo=this.primero+1;
			}
	}
	
	public boolean estaVacia(){
		if(this.num==0){
			return (true);
		}
		else{
		return (false);}
	}
	
	public void mostrarCola(){
		if(this.estaVacia()==false){
			for(int i=this.primero;i<=this.ultimo;i++){
				System.out.println(this.datos[i]);
			}
		}
		else{
			System.out.println("No hay elementos");
		}
	}
}
