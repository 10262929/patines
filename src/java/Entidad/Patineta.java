/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*Este es el modelo donde se ejeuta los metodos constructores
 */
package Entidad;

/**
 *
 * @author : Braham Marin
 */
public class Patineta {
    private int id;
     private String nombre;
     private String apellidos;
     private String codigoPatin;
     private String color;
     private String descripcion;
   /**
     *
     * @param id
     * @param nombre
     * @param apellidos
     * @param codigoPatin
     * @param color
     * @param descripcion
     */
    public Patineta(int id, String nombre, String apellidos, String codigoPatin, String color, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigoPatin = codigoPatin;
        this.color = color;
        this.descripcion = descripcion;
    }
  
    /**
     * Metod Contructor blank
     */
    public Patineta() {
        
    }
    
    /**
     *Method Get   
     *  
     * 
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     *Method SET 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *Method Get   
     * 
     *
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *Method SET 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Method GET
     *   
     * @return 
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *Method SET
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *Method Get
     
     */
    public String getCodigoPatin() {
        return codigoPatin;
    }

    /**
     *Method SET
     * @param codigoPatin
     */
    public void setCodigoPatin(String codigoPatin) {
        this.codigoPatin = codigoPatin;
    }

    /**
     *Method GET
     *
     * @return 
     */
    public String getColor() {
        return color;
    }

    /**
     *Method SET
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *Method GET
     * 
     * 
     * @return 
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**Method SET
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
