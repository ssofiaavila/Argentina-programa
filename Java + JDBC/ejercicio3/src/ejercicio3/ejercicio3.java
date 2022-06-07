package ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*3.      Una fabricadora de bijouterie desea realizar un sorteo para su página de Instagram. Para ello, había almacenado manualmente en una base de datos todas sus clientes que habían comentado la publicación. Sin embargo, se dio cuenta que varios no habían cumplido con las condiciones del sorteo, por lo cual desea eliminarlos. Cada cliente tiene los datos: nombre, apellido, edad, compartió y comento. Donde los atributos compartió y comento pueden contener los valores si o no.*/
public class ejercicio3 {
	public static void main (String[]args) throws SQLException {
	
	List <Participante> participantes= new ArrayList<Participante>();
	Connection conexion=null;
	String jdbc= "jdbc:mysql://localhost:3306/clientes";
	try {
		conexion= DriverManager.getConnection(jdbc, "root", "329442");
		System.out.println("Connected");
		
	}
	catch (SQLException sql) {
		System.out.println("Not connected");
	}
	
	
	PreparedStatement stmt= conexion.prepareStatement("DELETE FROM participantes WHERE compartio=0 and comento=0");
	stmt.execute();
	stmt= conexion.prepareStatement("SELECT nombre,apellido,edad FROM participantes");
	ResultSet result= stmt.executeQuery();
	String nombre, apellido;
	int edad;
	while (result.next()) {
		nombre= result.getString("nombre");
		apellido=result.getString("apellido");
		edad= result.getInt("edad");
		Participante part= new Participante(nombre,apellido,edad);
		participantes.add(part);
	}
	conexion.close();
	int i=0;
	while (i< participantes.size()) {
		Participante part= participantes.get(i);
		part.imprimir();
		i++;
	}
}
}