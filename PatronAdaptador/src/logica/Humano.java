/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Andrés
 */
public class Humano extends Personaje{

    @Override
    public void atacar() {
    	JOptionPane.showMessageDialog(null, "ATACANDO");
        
    }
    
}
