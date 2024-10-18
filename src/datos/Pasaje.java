/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author Estudiante
 */
public class Pasaje {
    
    private float precio;
    private String destino;

    public Pasaje(float precio, String destino) {
        this.precio = precio;
        this.destino = destino;
    }
    
    

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public float Total(){
        float impuesto = precio * 0.1f;
        return impuesto + precio;
    }
    
    
}
