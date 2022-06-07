package ejercicio3;

public class Participante {
	private String nombre,apellido;
	private int edad;
	private boolean compartio,comento;
	
	
	public Participante(String nombre, String apellido, int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.comento=true;
		this.compartio=true;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public int getEdad() {
		return edad;
	}


	public boolean isCompartio() {
		return compartio;
	}


	public boolean isComento() {
		return comento;
	}


	public void imprimir() {
		System.out.println("Nombre: "+ this.getNombre()+ " Apellido: "+ this.getApellido()+ " Edad: "+ this.getEdad());
		
	}
	
		
}
