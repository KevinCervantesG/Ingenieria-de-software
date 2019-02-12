package com.mycompany.mapita.modelo;
// Generated 12/02/2019 02:13:18 PM by Hibernate Tools 4.3.1



/**
 * Marcador generated by hbm2java
 */
public class Marcador  implements java.io.Serializable {


     private int idMarcador;
     private Usuario usuario;
     private String descripcionMarcador;
     private double longitud;
     private double latitud;

    public Marcador() {
    }

    public Marcador(int idMarcador, Usuario usuario, String descripcionMarcador, double longitud, double latitud) {
       this.idMarcador = idMarcador;
       this.usuario = usuario;
       this.descripcionMarcador = descripcionMarcador;
       this.longitud = longitud;
       this.latitud = latitud;
    }
   
    public int getIdMarcador() {
        return this.idMarcador;
    }
    
    public void setIdMarcador(int idMarcador) {
        this.idMarcador = idMarcador;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getDescripcionMarcador() {
        return this.descripcionMarcador;
    }
    
    public void setDescripcionMarcador(String descripcionMarcador) {
        this.descripcionMarcador = descripcionMarcador;
    }
    public double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }




}

