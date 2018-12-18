package campeonato.modelo.dao;

import java.util.List;

import campeonato.modelo.Competidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompetidorDao implements GenericDao<Competidor> {

	public Connection getConnection() throws SQLException{
		// Link do banco de dados
		String url = "jdbc:h2:tcp://localhost/~/campeonato";
		
		String user = "root"; // nome de usuario para acesso ao banco
		String pass = "root"; // senha de acesso ao banco
		
		return DriverManager.getConnection(url);
	}
	
	@Override
	public void insert(Competidor e) {
		// TODO Auto-generated method stub
		
		try (Connection con = getConnection()){
			String sql = "insert into competicao (nome, rg, sexo, telefone, estiloMusical) values (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, e.getNome());
			ps.setString(2, e.getRg());
			ps.setString(3, e.getSexo());
			ps.setString(4, e.getTelefone());
			ps.setString(5, e.getEstiloMusical());
			ps.executeUpdate();
		}catch(SQLException e1){
			e1.printStackTrace();
		
		}
			
			
			
		}
		

	@Override
	public Competidor select(long id) {
		// TODO Auto-generated method stub
		String sql = "select * from competicao where id = ?";
		
		try (Connection con = getConnection()){
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Competidor c = new Competidor(id, sql, sql, sql, sql, sql);
				c.setId(rs.getLong("id"));
				c.setNome(rs.getString("nome"));
				c.setSexo(rs.getString("sexo"));
				c.setTelefone(rs.getString("telefone"));
				c.setEstiloMusical(rs.getString("estiloMusical"));
				return c;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Competidor> select() {
		ArrayList<Competidor> lista = new ArrayList<Competidor>();

		String sql = "select * from competicao";

		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Competidor c = new Competidor(0, sql, sql, sql, sql, sql);
				c.setId(rs.getLong("id"));
				c.setNome(rs.getString("nome"));
				c.setSexo(rs.getString("sexo"));
				c.setTelefone(rs.getString("telefone"));
				c.setEstiloMusical(rs.getString("estiloMusical"));
				lista.add(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	@Override
	public void update(Competidor e) {
		// TODO Auto-generated method stub
		String sql = "update cmpeticao " + "set nome = ?, sexo = ?, telefone = ?, estiloMusical = ? " + "where id = ?";
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, e.getNome());
			ps.setString(2, e.getSexo());
			ps.setString(3, e.getTelefone());
			ps.setString(4, e.getEstiloMusical());
			ps.setLong(5, e.getId());
			ps.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
	}

	@Override
	public void delete(Competidor e) {
		// TODO Auto-generated method stub
		String sql = "delete from competicao where id = ?";
		try (Connection con = getConnection()) {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1, e.getId());
			ps.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
		
	}
	
	
}
