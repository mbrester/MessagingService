
package messegingservice;

/**
 *
 * @author mbrester1
 */

//mkausalik@my.wctc.edu
//Thank you :)

public class Startup {
    
    
    public static void main(String[] args) {
    
        MessagingService messager = new MessagingService(new ConsoleMessageOutputStrategy(), new ConsoleMessageInputStrategy());
    
        
        messager.displayMessage();
        
        
    }
}
