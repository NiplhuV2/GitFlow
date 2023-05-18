/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import control.CMediana;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import oovv.Mediana;
import oovv.NegativoException;
import vista.FMediana;

/**
 *
 * @author Alex
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NegativoException {
        
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un valor de 10 o más: "));
            Mediana m = new Mediana(num);
            FMediana f = new FMediana();
            CMediana c = new CMediana(f, m);
            f.setOidor(c);
            f.setVisible(true);
        } catch (NegativoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
}
