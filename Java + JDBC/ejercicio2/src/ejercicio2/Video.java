package ejercicio2;

public class Video {
	private double duracion;
	private String titulo;
	
	
	public Video(double duracion, String titulo) {
		this.duracion=duracion;
		this.titulo=titulo;
	}


	public void imprimir() {
		System.out.println("Duracion: "+ this.getDuracion()+ " Titulo: "+ this.getTitulo());
	}


	private double getDuracion() {
		return this.duracion;
	}


	private String getTitulo() {
		return this.titulo;
	}
}
