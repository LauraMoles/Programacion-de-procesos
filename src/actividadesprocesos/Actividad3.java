/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesprocesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laura
 */
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProcessBuilder pb;
        Process proc;
        BufferedReader br;
        String line;
        
        //Este comando muestra el contenido del directrio ActividadesProcesos(la carpeta del proyecto)
        pb = new ProcessBuilder("cmd.exe", "/C", "dir");

        try {
            proc = pb.start();
            br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            while ((line = br.readLine ()) != null) {
                System.out.println(line); 
            }
                       
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Este comando muestra el contenido del directrio c:\
        pb = new ProcessBuilder("cmd.exe", "/C", "dir C:\\ ");

        try {
            proc = pb.start();
            br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            while ((line = br.readLine ()) != null) {
                System.out.println(line); 
            }
                       
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
