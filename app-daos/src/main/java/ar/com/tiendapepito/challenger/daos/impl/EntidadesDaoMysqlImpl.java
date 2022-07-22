package ar.com.tiendapepito.challenger.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import ar.com.tiendapepito.challenger.daos.ProductoDao;
import ar.com.tiendapepito.challenger.db.AdministradorDeConexiones;
import ar.com.tiendapepito.challenger.entity.Producto;
import ar.com.tiendapepito.challenger.exceptions.DuplicatedException;
import ar.com.tiendapepito.challenger.exceptions.GenericException;

public class EntidadesDaoMysqlImpl extends ClaseBaseDao<Producto> implements ProductoDao {

	public EntidadesDaoMysqlImpl() {
		super("producto");
	}

	@Override
	public void save(Producto entity) throws DuplicatedException, GenericException {

		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {

			StringBuffer sql = new StringBuffer("INSERT INTO PRODUCTO (NOMBRE,CODIGO, STOCK, ID_CATEGORIA,PRECIO) VALUES(");
			sql.append("?,?,?,?,?)");

			try (PreparedStatement st = con2.prepareStatement(sql.toString(),
					PreparedStatement.RETURN_GENERATED_KEYS)) {

				st.setString(1, entity.getNombre());
				st.setLong(2, entity.getCodigo());
				st.setLong(3, entity.getStock());
				st.setLong(4, entity.getId_categoria());
				st.setDouble(5, entity.getPrecio());
				st.execute();

				try (ResultSet rs = st.getGeneratedKeys()) {

					if (rs.next()) {

						Long id = rs.getLong(1);

						entity.setId_producto(id);
					}
				}
			}
		} catch (SQLException se) {
			if (se instanceof SQLIntegrityConstraintViolationException) {
				throw new DuplicatedException("No se ha podido insertar el articulo, integridad de datos violada", se);
			}
			throw new GenericException(se.getMessage(), se);
		} catch (GenericException ge) {
			throw new GenericException(ge.getMessage(), ge);
		}
	}

	@Override
	public void update(Producto productToUpdate) throws GenericException {

		StringBuffer sql = new StringBuffer("UPDATE PRODUCTO SET ");
		if (productToUpdate.getCodigo() != null) {
			sql.append("codigo=?").append(", ");

		}
		if (productToUpdate.getStock() != null) {
			sql.append("stock=?").append(", ");

		}
		if (productToUpdate.getId_categoria() != null) {
			sql.append("id_categoria=?").append(", ");
		}
		if (productToUpdate.getNombre() != null) {
			sql.append("nombre=?").append(", ");
		}
		if (productToUpdate.getPrecio() != null) {
			sql.append("precio=?").append(",");
		}
		
		sql = new StringBuffer(sql.substring(0, sql.length()-1));
		sql.append(" where id_producto=?");
		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			try (PreparedStatement st = con2.prepareStatement(sql.toString())) {

				if (productToUpdate.getCodigo() != null) {
					st.setLong(1, productToUpdate.getCodigo());
				}
				if (productToUpdate.getStock() != null) {
					st.setLong(2, productToUpdate.getStock());
				}
				if (productToUpdate.getId_categoria() != null) {
					st.setLong(3, productToUpdate.getId_categoria());
				}
				if (productToUpdate.getNombre() != null) {
					st.setString(4, productToUpdate.getNombre());
				}
				if (productToUpdate.getPrecio() != null) {
					st.setDouble(5, productToUpdate.getPrecio());
				}
				

				st.setLong(6, productToUpdate.getId_producto());

				st.execute();
			}

		} catch (SQLException se) {
			throw new GenericException(se.getMessage(), se);
		}

	}

	
	
	public Producto ResultSetToEntity(ResultSet rs) throws SQLException {
		Long idProducto=rs.getLong("id_producto");
		Long codigo=rs.getLong("codigo");
		Long stock=rs.getLong("stock");
		Long idCategoria=rs.getLong("id_categoria");
		String nombre=rs.getString("nombre");
		Double precio=rs.getDouble("precio");
		
		
		
		return new Producto(idProducto, codigo, stock, idCategoria, nombre, precio);
	}

	

	

		

	@Override
	public Producto getByCode(Long codigo) throws GenericException {
		try(Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			String sql = "SELECT * FROM PRODUCTO WHERE codigo = ?";
			
			try (PreparedStatement st = con2.prepareStatement(sql)) {
				
				st.setLong(1, codigo);
				
				try(ResultSet rs = st.executeQuery()) { 
					Producto producto= null;
					if(rs.next()) {
						producto = ResultSetToEntity(rs);
					}
					return producto;
				}
			} catch (SQLException e) {
				throw new GenericException("No se pudo obtener el articulo id:"+codigo, e);
			}
		} catch (SQLException e) {
			throw new GenericException("No se pudo obtener el articulo id:"+codigo, e);
		}
	}
}
