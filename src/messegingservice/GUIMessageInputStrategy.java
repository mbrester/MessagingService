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
public class GUIMessageInputStrategy implements MessageInputStrategy{

    @Override
    public String getMessage() {
        return JOptionPane.showInputDialog("Type message");
    }
    
}
