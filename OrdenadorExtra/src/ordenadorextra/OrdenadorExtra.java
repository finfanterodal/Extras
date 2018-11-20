/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenadorextra;
import javax.swing.JOptionPane;
/**
 *
 * @author finfanterodal
 */
public class OrdenadorExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Ordenador pc=new Ordenador();
    pc.setCpu(8, 32);
    pc.setMonitor("Samsung", 28f);
    pc.setRato("Razer1", true);
    pc.setTeclado(102);
    pc.visualizar();
    JOptionPane.showMessageDialog(null,pc.getPrecio());
    }
    
}
