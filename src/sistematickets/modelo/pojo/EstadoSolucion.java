/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematickets.modelo.pojo;

/**
 *
 * @author Usuario
 */
public class EstadoSolucion {
    int idEstadoSolucion;
    String descripcion;
    
    public EstadoSolucion(){
    }

    public EstadoSolucion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public int getIdEstadoSolucion() {
        return idEstadoSolucion;
    }

    public void setIdEstadoSolucion(int idEstadoSolucion) {
        this.idEstadoSolucion = idEstadoSolucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
}
