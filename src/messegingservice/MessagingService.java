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
public class MessagingService {
    private MessageOutputStrategy output;
    private MessageInputStrategy input;

    public MessagingService(MessageOutputStrategy output, MessageInputStrategy input) {
        this.output = output;
        this.input = input;
    }

    public MessagingService() {
    }

    public void displayMessage(){
        output.displayMessage(input.getMessage());
    }
    
    public MessageOutputStrategy getOutput() {
        return output;
    }

    public void setOutput(MessageOutputStrategy output) {
        this.output = output;
    }

    public MessageInputStrategy getInput() {
        return input;
    }

    public void setInput(MessageInputStrategy input) {
        this.input = input;
    }
    
    
    
    
}
