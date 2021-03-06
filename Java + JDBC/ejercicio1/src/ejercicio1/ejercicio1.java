package ejercicio1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;


/*{Una despensa de un barrio desea realizar el alta de sus diferentes productos a una base de datos. Para ello, tiene una tabla creada en su base de datos, llamada productos. A partir de esto desea poder solicitar por teclado cada uno de los elementos de un producto: código, nombre, marca, precio, cantidad_stock y guardarlos en la correspondiente tabla. Utilizar para ello la tecnología JDBC y la correspondiente consulta SQL.*/



public class ejercicio1 {
	public static void main(String []args) throws SQLException {
		Connection conexion = null;
		String jdbc= "jdbc:mysql://localhost:3306/productos"; //me linkeo a la BD
		try {
			conexion= DriverManager.getConnection(jdbc, "root", "root");
			System.out.println("Ingreso");
			
			
					
		}
		catch (SQLException sql) {
			
		}
		
		
		PreparedStatement stmt= conexion.prepareStatement("SELECT  codigo, nombre, marca, precio, cantidad_stock FROM productos");
		ResultSet result = stmt.executeQuery();
		int codigo;
		String nombre,marca;
		double precio;
		int cantidad_stock;
		while (result.next()) {
			codigo= result.getInt("codigo");
			nombre= result.getString("nombre");
			marca= result.getString("marca");
			precio= result.getDouble("precio");
			cantidad_stock=result.getInt("cantidad_stock");
			System.out.println(nombre + "\t"+ marca + "\t" + precio + "\t"+ cantidad_stock + "\t" + marca);		
		}
		conexion.close(); //cierro la conexion a la BD
		
		
	}
}
