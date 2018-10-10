//Codifica un  programa que calcule, la longitud de una circunferencia, el área de un círculo y el volumen de una esfera.
package extra1;
import java.util.Scanner;
/**
 *
 * @author finfanterodal
 */
public class Extra1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    final double PI=3.14;
    double radio;
    do{
    System.out.println("Introduce el Radio:");
   radio=leer.nextDouble();
    }while(radio<0);
    System.out.println("La longitud de la circunferencia es = "+Math.round(2*PI*radio));
    System.out.println("\nEl área del círculo es = "+Math.round(PI*Math.pow(radio, 2)));
    System.out.println("\nEl Volumen de la esfera es = "+Math.round(4/3*PI*Math.pow(radio, 3)));
    
    }   
}
