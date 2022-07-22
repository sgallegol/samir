package ar.com.tiendapepito.challenger.daos.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.tiendapepito.challenger.daos.VendedorDao;

import ar.com.tiendapepito.challenger.db.AdministradorDeConexiones;
import ar.com.tiendapepito.challenger.entity.Vendedor;
import ar.com.tiendapepito.challenger.exceptions.DuplicatedException;
import ar.com.tiendapepito.challenger.exceptions.GenericException;

public class VendedorDaoMysqlImpl extends ClaseBaseDao<Vendedor> implements VendedorDao {

	public VendedorDaoMysqlImpl() {
		super("vendedor");
	}

	

	@Override
	public void update(Vendedor productToUpdate) throws GenericException {

		StringBuffer sql = new StringBuffer("UPDATE Vendedor SET ");
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
			sql.append("nombre=?").append(",");
		}
		sql = new StringBuffer(sql.substring(0, sql.length()-1));
		sql.append(" where id_Vendedor=?");
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

				st.setLong(5, productToUpdate.getId());

				st.execute();
			}

		} catch (SQLException se) {
			throw new GenericException(se.getMessage(), se);
		}

	}

	
	
	public Vendedor ResultSetToEntity(ResultSet rs) throws SQLException {
		Long id=rs.getLong("id");
		String nombre=rs.getString("nombre");
		Long telefono=rs.getLong("telefono");
		String fecha_ingreso=rs.getString("nombre");
		
		
		
		
		return new Vendedor(id, nombre, telefono, null);
	}



	@Override
	public void save(Vendedor entity) throws DuplicatedException, GenericException {
		// TODO Auto-generated method stub
	}

	

	

	
	
}
