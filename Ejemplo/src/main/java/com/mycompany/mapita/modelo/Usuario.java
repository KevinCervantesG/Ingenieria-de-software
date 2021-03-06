package com.mycompany.mapita.modelo;
// Generated 12/02/2019 02:13:18 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombre;
     private String correo;
     private String contrasenia;
     private Date fechaNacimiento;
     private Set marcadors = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario, String nombre, String correo, String contrasenia, Date fechaNacimiento) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
    }
    public Usuario(int idUsuario, String nombre, String correo, String contrasenia, Date fechaNacimiento, Set marcadors) {
       this.idUsuario = idUsuario;
       this.nombre = nombre;
       this.correo = correo;
       this.contrasenia = contrasenia;
       this.fechaNacimiento = fechaNacimiento;
       this.marcadors = marcadors;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
 
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Set getMarcadors() {
        return this.marcadors;
    }
    
    public void setMarcadors(Set marcadors) {
        this.marcadors = marcadors;
    }




}


