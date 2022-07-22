package ar.com.tiendapepito.challenger.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ar.com.tiendapepito.challenger.exceptions.GenericException;


public class AdministradorDeConexiones {

	public static Connection obtenerConexion() throws GenericException{
		String host = "localhost";
		String user = "root";
		String password = "root";
		String dbName = "dbdesafiohemisferiod_tiendapepito";
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://"+host+"/"+dbName+"?serverTimeZone=UTC&userSSL=false";
		
		//crecion de la clase que pertenece al "jar" mysql-connector
		//no puedo hacer un new Driver, cargar dinamicamente una clase
		//usando:
		
		try {
			Class.forName(driverName);
			
			Connection connection = DriverManager.getConnection(url, user, password);
			
			return connection;
		}catch(SQLException sqe) {
			throw new GenericException("no se ha podido conectar a:"+url,sqe);
		} catch (ClassNotFoundException cnfe) {
			
		throw new GenericException("no se ha encontrado el driver:"+ driverName,cnfe);
		}
		
	}
	
	public static void main(String[] args) throws GenericException {
		obtenerConexion();
	}
}
		
	
	
	


