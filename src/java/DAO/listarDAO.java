package DAO;

import Entidad.Patineta;
import config.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author : Braham Marin
 */
public class listarDAO {

    JdbcTemplate jdbcTemplate;
    Conexion con = new Conexion();
    List datos;

    /**
     *Metodo para realizar la consulta
     * @return
     */
    public List listar() {
        String sql = "select * from usuariopatineta";
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        datos = this.jdbcTemplate.queryForList(sql);
        return datos;
    }

    /**
     * Method INSERT
     */
    /**
     * @param nombres
     * @param apellidos
     * @param codigo
     *  @param color
     *  @param descripcion
     * 
     * 
     */
    public void insert(String nombres, String apellidos, String codigo, String color, String  descripcion) {
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "insert into usuariopatineta (nombre_usuario,apellidos_usuarios,codigoPatineta,colorPatineta,descripcionPatineta)values('" + nombres + "', '" + apellidos + "','" + codigo + "','" + color + "','" + descripcion + "')";
        this.jdbcTemplate.update(sql);
    }

    /**
     * public Persona buscarPersonaxID(int id) { final Persona p = new
     * Persona(); String sql = "select * from persona where id = " + id; return
     * (Persona) jdbcTemplate.query(sql, new ResultSetExtractor<Patineta>() {
     * public Persona extractData(ResultSet rs) throws SQLException,
     * DataAccessException { if (rs.next()) { p.setDNI(rs.getString("DNI"));
     * p.setDNI(rs.getString("nombres")); } return p; } });
    }
     */
    /**
     * Method editar
     */
    /**      *
     * @param Id
     * @param nombr
     * @param apellidos
     * @param codigo
     * @param color
     * @param descrip
     */
    public void Editar(int Id,String nombr, String apellidos, String codigo, String color, String descrip) {
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "update usuariopatineta  set nombre_usuario='" + nombr + "', apellidos_usuarios='" + apellidos + "', codigoPatineta='" + codigo + "', colorPatineta='" + color +  "', descripcionPatineta='" + descrip + "' where id = '" + Id + "'";
        this.jdbcTemplate.update(sql);
//        
    }
    /** Method of Eliminar 
     * @param id 
*/
    public void eliminarPatineta(int id) {
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "delete from usuariopatineta where id ='" + id + "'";
        this.jdbcTemplate.update(sql);
    }
}
