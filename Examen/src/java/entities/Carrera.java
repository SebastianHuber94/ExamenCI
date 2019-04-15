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
public class Carrera {
    int id_carrera;
    String descripcion;
    
    public void carrera() {
        id_carrera = 0;
        descripcion = "";
                
    }

    public Carrera(int id_carrera, String descripcion) {
        this.id_carrera = id_carrera;
        this.descripcion = descripcion;
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "carrera{" + "id_carrera=" + id_carrera + ", descripcion=" + descripcion + '}';
    }
    
}
