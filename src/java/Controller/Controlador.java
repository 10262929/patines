/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Este es el el controlador se encarga de realizar las peticiones
 */
package Controller;

import DAO.listarDAO;
import Entidad.Patineta;
import Entidad.PatinetaValidation;
import com.sun.net.httpserver.HttpServer;
import config.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author : Braham Marin
 */
@Controller
public class Controlador {

    private JdbcTemplate jdbcTemplate;
    PatinetaValidation perValidar;

    /**
     *Este Metodo es para validar la informacion al aregegar un nuevo campo
     */
    public Controlador() {
        this.perValidar = new PatinetaValidation();
        Conexion con = new Conexion();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }

    int id;
    List datos;
//select datos
//    @RequestMapping("index.htm")

//    public ModelAndView listar() {
//
//        String sql = "select * from persona";
//
//        datos = this.jdbcTemplate.queryForList(sql);
//        mav.addObject("lista", datos);
//        mav.setViewName("index");
//        return mav;
//    }

    /**
     *
     * @return 
     */
    @RequestMapping("index.htm")
    public ModelAndView listar() {
        ModelAndView mav = new ModelAndView();
        listarDAO listDAO = new listarDAO();
        mav.addObject("lista", listDAO.listar());
        return mav;
    }

//insert datos

    /**
     *
     * @return
     */
    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("formAddPatineta", new Patineta());
        mav.setViewName("agregar");
        return mav;
    }

    /**
     *
     * @param p
     * @param result
     * @param status
     * @return : Vista Model and view
     */
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(
            @ModelAttribute("formAddPatineta") Patineta p,
            BindingResult result,
            SessionStatus status) {
        this.perValidar.validate(p, result);
        if (result.hasErrors()) {
            ModelAndView mav = new ModelAndView();
            mav.addObject("formAddPatineta", new Patineta());
            mav.setViewName("agregar");
            return mav;
        } else {
            ModelAndView mav = new ModelAndView();
            listarDAO listDAO = new listarDAO();
            int id  = p.getId();
            String nomb = p.getNombre();
            String apelli = p.getApellidos();
            String codigo = p.getCodigoPatin();
            String color = p.getColor();
            String descrip = p.getDescripcion();
            listDAO.insert( nomb,apelli,codigo,color,descrip);
            mav.setViewName("redirect:/index.htm");
            return mav;
        }
    }

    /**
     * UPDATE
     *
     * @param request
     * @return : Vista Model and view
     */
//Update datos
    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
//        listarDAO consultar = new listarDAO();
        int Id = Integer.parseInt(request.getParameter("id"));
        //String sql = "select * from persona where id = " + id;        
        Patineta p = this.buscarPatinetaxID(Id);
        //datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("listar", new Patineta(Id, p.getNombre(), p.getApellidos(), p.getCodigoPatin(), p.getColor(), p.getDescripcion()));
        mav.setViewName("editar");
        return mav;
    }

    /**
     *
     * @param p
     * @param result
     * @param status
     * @return : Vista Model and view
     */
    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(
            @ModelAttribute("listar") Patineta p,
            BindingResult result,
            SessionStatus status
    ) {
        this.perValidar.validate(p, result);
        if (result.hasErrors()) {
            ModelAndView mov = new ModelAndView();
            mov.addObject("listar", new Patineta());
            mov.setViewName("editar");
            return mov;
        } else {
            ModelAndView mav = new ModelAndView();
            listarDAO listdao = new listarDAO();
            String nomb = p.getNombre();
            String apelli = p.getApellidos();
            String codigo = p.getCodigoPatin();
            String color = p.getColor();
            String descrip = p.getDescripcion();
            int Id = p.getId();
            listdao.Editar(Id, nomb,apelli,codigo,color,descrip);
            mav.setViewName("redirect:/index.htm");
            return mav;
        }
//        String sql = "update persona  set DNI=?, nombres=? where id = ?";
//        this.jdbcTemplate.update(sql, p.getDNI(), p.getNombres(), id);
//        return new ModelAndView("redirect:/index.htm");
    }

    /**
     *
     * @param id
     * @return
     */
    public Patineta buscarPatinetaxID(int id) {
        final Patineta p = new Patineta();
        String sql = "select * from usuariopatineta where id = " + id;
        return (Patineta) jdbcTemplate.query(sql, new ResultSetExtractor<Patineta>() {
            public Patineta extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                   
                    p.setNombre(rs.getString("nombre_usuario"));
                    p.setApellidos(rs.getString("nombre_usuario"));
                    p.setCodigoPatin(rs.getString("codigoPatineta"));
                    p.setColor(rs.getString("colorPatineta"));
                    p.setDescripcion(rs.getString("descripcionPatineta"));
                }
                return p;
            }
        });
    }
//Delete datos

    /**
     *
     *
     * @param request
     * @return : Vista Model and view
     */
    @RequestMapping("eliminar.htm")
    public ModelAndView Eliminar(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        id = Integer.parseInt(request.getParameter("id"));
        listarDAO listdao = new listarDAO();
        listdao.eliminarPatineta(id);
//        String sql = "delete from persona where id =" + id;
//        this.jdbcTemplate.update(id);
        mav.setViewName("redirect:/index.htm");
        //return new ModelAndView("redirect:/index.htm");
        return mav;
    }
}
