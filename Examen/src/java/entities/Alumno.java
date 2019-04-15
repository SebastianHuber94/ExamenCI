/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author shb
 */
public class Alumno {
    int id;
    String nombre;
    String apellido;
    String nroDocumento;
    
    public Alumno(){
        id = 0;
        nombre = "";
        apellido = "";
        nroDocumento = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Alumno(int id, String nombre, String apellido, String nro_documento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroDocumento = nroDocumento;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getnroDocumento() {
        return nroDocumento;
    }

    public void setNro_documento(String nro_documento) {
        this.nroDocumento = nro_documento;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nroDocumento=" + nroDocumento + '}';
    }
    
    
}
