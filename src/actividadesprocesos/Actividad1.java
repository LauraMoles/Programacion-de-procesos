/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesprocesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laura
 */
public class Actividad1 extends Thread {

    public static void main(String args[]) {
        ProcessBuilder pb;
        String out = null;
        Process proc = null;
        StringBuilder sb = new StringBuilder();
        String line;

        pb = new ProcessBuilder("cmd.exe", "/C", "python jsonJDT.py");

        try {

            proc = pb.start();
            proc.waitFor();
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        try {
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
            out = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(out);

    }
}
