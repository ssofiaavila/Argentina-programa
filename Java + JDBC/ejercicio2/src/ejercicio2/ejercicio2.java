package ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*Un youtuber posee almacenados en una tabla llamada videos dentro de una base de datos, todos sus 
 * videos que ya fueron subidos a Youtube. Desea un programa que sea capaz de traer todos esos videos,
 *  almacenarlos en una lista y mostrarlos luego por pantalla. Utilizar para ello la tecnología JDBC.*/



public class ejercicio2 {
	public static void main (String []args) throws SQLException{
		
		
		List videos= new ArrayList<Video>();
		Connection conexion= null;
		String jdbc= "jdbc:mysql://localhost:3306/Youtuber";
		try {
			conexion= DriverManager.getConnection(jdbc,"root","329442");
			System.out.println("Conectado");			
		}
		catch (SQLException sql) {
			System.out.print("No conectado");
		}
		
		PreparedStatement stmt= conexion.prepareStatement("SELECT duracion, titulo FROM videos");
		ResultSet result= stmt.executeQuery();		
		double duracion;
		String titulo;
		
		while (result.next()) {
			duracion= result.getDouble("duracion");
			titulo= result.getString("titulo");
			Video videito= new Video(duracion,titulo);
			videos.add(videito);
		}
		conexion.close();
		int i=0;
		while (i < videos.size()){
			Video videito = (Video) videos.get(i);
			videito.imprimir();
			i++;
			
		}
		
		
		
		
	}
}
