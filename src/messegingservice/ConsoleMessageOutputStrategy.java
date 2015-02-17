/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messegingservice;

/**
 *
 * @author mbrester1
 */
public class ConsoleMessageOutputStrategy implements MessageOutputStrategy {
    @Override
    public void displayMessage(String messege){
        System.out.println(messege);  
    }
}
