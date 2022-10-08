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
public class Actividad1{

    public static void main(String args[]) {
        ProcessBuilder pb;
        Process proc;
        BufferedReader br;

        pb = new ProcessBuilder("cmd.exe", "/C", "python jsonJDT.py");

        try {
            proc = pb.start();
            br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            System.out.println(br.readLine());            
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
