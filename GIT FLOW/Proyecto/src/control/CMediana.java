/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Mediana;
import oovv.NegativoException;
import vista.FMediana;

/**
 *
 * @author usuario
 */
public class CMediana implements ActionListener {

    private FMediana finestra;
    private Mediana model;

    public CMediana(FMediana finestra, Mediana mediana) {
        this.finestra = finestra;
        this.model = mediana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "Añadir Numero":
                    if (model.getCont() == model.getLongitud()) {
                        finestra.canvia(false);
                        model.setCont(0);
                        JOptionPane.showMessageDialog(finestra, "No puedes introducir más numeros");
                    } else {
                        model.añadirNum(finestra.getNum());
                        model.incrementa();
                        finestra.borrarNum();
                    }
                    break;
                case "Calcular Mediana":
                    finestra.mostra(model.calculaMediana());
                    break;
                case "Aleatoria":
                    model.aleatoria();
                    finestra.activaAñadir(false);
                    break;
                case "Mostrar Nombres":
                    finestra.mostra(model.llistatNombres());
                    break;
                case "Eliminar Nombres":
                    model.eliminarNombres();
                    finestra.activaAñadir(true);
                    break;
                case "Borrar":
                    finestra.borrar();
                    break;
                case "Salir":
                    System.exit(0);
                    break;
            }
        } catch (NegativoException ex) {
            JOptionPane.showMessageDialog(finestra, ex.getMessage());
        }
    }

}
