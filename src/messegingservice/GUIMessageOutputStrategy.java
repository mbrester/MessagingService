/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messegingservice;

import javax.swing.JOptionPane;

/**
 *
 * @author mbrester1
 */
public class GUIMessageOutputStrategy implements MessageOutputStrategy {

    @Override
    public void displayMessage(String messege) {
        JOptionPane.showMessageDialog(null, messege);
    }
    
}
