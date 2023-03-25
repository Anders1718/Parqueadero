/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finca;

/**
 *
 * @author User
 */
public class Conexion {

   
    public static String user = "root";
    public static String clave = "";
    public static String url = "jdbc:mysql://localhost:3306/finca";
    public static String urlTurbo = "jdbc:mysql://localhost:3306/turbo";
    
    
    public static String nombreNegocio = "Parqueadero Los Naranjos";
    
    static String correo = "outletparatodos@outlook.com";
    static String contrasena = "Outlet2022";
    
     public Conexion() {
         
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Conexion.user = user;
    }

    public static String getClave() {
        return clave;
    }

    public static void setClave(String clave) {
        Conexion.clave = clave;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        Conexion.url = url;
    }

    public static String getNombreNegocio() {
        return nombreNegocio;
    }

    public static void setNombreNegocio(String nombreNegocio) {
        Conexion.nombreNegocio = nombreNegocio;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Conexion.correo = correo;
    }

    public static String getContrasena() {
        return contrasena;
    }

    public static void setContrasena(String contrasena) {
        Conexion.contrasena = contrasena;
    }
     
     
    
    
    
}
