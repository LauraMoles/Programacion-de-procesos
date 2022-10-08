/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesprocesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laura
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProcessBuilder pb;
        Process proc = null;
        BufferedReader br;

        pb = new ProcessBuilder("cmd.exe", "/C", "segundos10.py");

        try {
            proc = pb.start();
        
            while (proc.isAlive()) {                
                
                    Thread.sleep(5*1000);
                    
                        System.out.println(proc.isAlive());

            }
        }catch (IOException ex) {
            Logger.getLogger(Actividad2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad2.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
    }
    
}
