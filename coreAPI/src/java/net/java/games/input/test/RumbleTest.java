/*
 * RumbleTest.java
 *
 * Created on 01 December 2003, 23:02
 */
package net.java.games.input.test;

import net.java.games.input.ControllerEnvironment;
import net.java.games.input.Controller;
import net.java.games.input.Rumbler;

/**
 *
 * @author  Jeremy
 */
public class RumbleTest {
    
    /** Creates a new instance of RumbleTest */
    public RumbleTest() {
        ControllerEnvironment ca = ControllerEnvironment.getDefaultEnvironment();
        Controller[] controllers = ca.getControllers();
        for(int i=0;i<controllers.length;i++) {
            System.out.println("Scanning " + controllers[i].getName());
            Rumbler[] rumblers = controllers[i].getRumblers();
            System.out.println("Found " + rumblers.length + " rumblers");
            for(int j=0;j<rumblers.length;j++) {
                System.out.println("Rumbling with intensity: " + 0.5f);
                rumblers[j].rumble(0.5f);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("Rumbling with intensity: " + 1.0f);
                rumblers[j].rumble(1f);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println("Rumbling with intensity: " + 0.0f);
                rumblers[j].rumble(0f);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new RumbleTest();
    }
    
}