package ar.com.tiendapepito.challenger.daos.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.tiendapepito.challenger.daos.GenericDao;
import ar.com.tiendapepito.challenger.db.AdministradorDeConexiones;
import ar.com.tiendapepito.challenger.exceptions.GenericException;

public abstract class ClaseBaseDao<T> implements GenericDao<T> {

	protected String tabla;

	public ClaseBaseDao(String tabla) {
		if (tabla == null) {
			throw new IllegalArgumentException("debe indicar la tabla");
		}

		this.tabla = tabla;
	}

	@Override
	public T getByPk(Long id) throws GenericException {
		try (Connection con2 = AdministradorDeConexiones.obtenerConexion()) {
			try (Statement st = con2.createStatement()) {
				String sql = "SELECT * FROM " + this.tabla + " WHERE ID_PRODUCTO = " + id;

				try (ResultSet rs = st.executeQuery(sql)) {
					T entity = null;
					if (rs.next()) {
						entity = this.ResultSetToEntity(rs);
					}
					return entity;
				}
			} catch (SQLException e) {
				throw new GenericException("No se pudo obtener el entity id:" + id, e);
			}
		} catch (SQLException e) {
			throw new GenericException("No se pudo obtener el entity" + this.tabla + " id:" + id, e);
		}

	}

	// las clase hija convierte el Resultset a la entidad correspondiente
	public abstract T ResultSetToEntity(ResultSet rs) throws SQLException;

	@Override
	public List<T> findAll() throws GenericException {

		List<T> registros = new ArrayList<>();

		String sql = "SELECT * FROM " + this.tabla;
		try (Connection con2 = AdministradorDeConexiones.obtenerConexion();
				Statement st = con2.createStatement();
				ResultSet rs = st.executeQuery(sql);) {

			while (rs.next()) {
				T entity = this.ResultSetToEntity(rs);
				registros.add(entity);
			}
		} catch (SQLException e) {
			throw new GenericException("Error ejecutando: " + sql, e);
		}
		return registros;
	}

	@Override
	public void delete(Long id) throws GenericException {

		String sql = "DELETE FROM " + this.tabla + " WHERE ID_PRODUCTO = " + id;
		try (Connection con2 = AdministradorDeConexiones.obtenerConexion(); 
				Statement st = con2.createStatement();) {
			st.executeUpdate(sql);
		} catch (GenericException ge) {
			throw new GenericException(sql, ge);
		} catch (SQLException se) {
			throw new GenericException(sql, se);
		}

	}

}
