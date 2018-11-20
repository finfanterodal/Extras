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
public class Cpu {

    //Atributos
    private int nucleos;
    private int ram;

    //Constructores
    public Cpu(int nucleos, int ram) {
        this.nucleos = nucleos;
        this.ram = ram;
    }

    public Cpu() {
    }

    //Setters
    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    //Getters
    public int getNucleos() {
        return nucleos;
    }

    public int getRam() {
        return ram;
    }
}
