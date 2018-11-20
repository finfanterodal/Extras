package ordenadorextra;
import javax.swing.JOptionPane;
/**
 *
 * @author finfanterodal
 */
public class Ordenador {
 //Atributos
    Cpu procesador;
    Rato raton; 
    Teclado teclado;
    Monitor monitor;
    private double precio;
//Constructor
public Ordenador(){
    procesador = new Cpu();
    raton = new Rato();
    teclado = new Teclado();
    monitor = new Monitor();
}
//Ponemos los datos

   public void setCpu(int nucleos, int ram) {
        procesador.setNucleos(nucleos);
       procesador.setRam(ram);
    }

  public void setMonitor(String marca,float pulgadas) {
      monitor.setMarca(marca);
      monitor.setPulgadas(pulgadas);
   }

   public void setTeclado(int numTeclas) {
       teclado.setNumTeclas(numTeclas);
   }

   public void setRato(String modelo, Boolean inalambrico) {
       raton.setModelo(modelo);
        raton.setTipo(inalambrico);
   }
           
    //Método para visualizar los datos
    public void visualizar(){
        JOptionPane.showMessageDialog(null,"\nNúmero de núcleos: "+procesador.getNucleos()+
                                           "\nCantidad de ram: "+procesador.getRam()+
                                           "\nModelo Ratón: "+raton.getModelo()+
                                           "\nTipo de ratón: "+raton.getTipo()+
                                           "\nNúmero de Teclas: "+teclado.getNumTeclas()+
                                           "\nMarca del monitor: "+monitor.getMarca()+
                                           "\nPulgadas del monitor: "+monitor.getRPulgadas());
    }
    //Método para calcular precio
    public double getPrecio(){
             double precio = procesador.getRam()*5 + teclado.getNumTeclas()*0.7 + monitor.getRPulgadas()*12;
        if(raton.getTipo() == true){
            return Math.round(precio * 1.5);
        }
        else{
            return Math.round(precio);
        }
    }
}
