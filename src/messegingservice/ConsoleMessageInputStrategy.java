
package messegingservice;

import java.util.Scanner;
/**
 *
 * @author mbrester1
 */
public class ConsoleMessageInputStrategy implements MessageInputStrategy{

    @Override
    public String getMessage() {
        
        System.out.println("Please enter a messege.");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
}
