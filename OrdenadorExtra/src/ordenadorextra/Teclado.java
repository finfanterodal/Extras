package ordenadorextra;

/**
 *
 * @author finfanterodal
 */
public class Teclado {
    //Atributos

    private int numTeclas;

    //Constructor
    public Teclado(int numteclas) {
        this.numTeclas = numteclas;
    }

    public Teclado() {
    }

    //Setters
    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    //Getters
    public int getNumTeclas() {
        return numTeclas;
    }
}
