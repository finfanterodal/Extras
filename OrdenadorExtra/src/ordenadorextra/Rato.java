/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenadorextra;

/**
 *
 * @author finfanterodal
 */
public class Rato {
    //Atributos

    private Boolean inalambrico;
    private String modelo;

    //Constructor
    public Rato(Boolean inalambrico, String modelo) {
        this.inalambrico = inalambrico;
        this.modelo = modelo;
    }
        public Rato() {
    }

    //Setters
    public void setTipo(Boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Getters
    public Boolean getTipo() {
        return inalambrico;
    }

    public String getModelo() {
        return modelo;
    }
}
