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
public class Monitor {
    //Atributos

    private String marca;
    private float pulgadas;

    //Constructor
    public Monitor(String marca, float pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }
        public Monitor() {
    }

    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas=pulgadas;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public float getRPulgadas() {
        return pulgadas;
    }
}
