/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesprocesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laura
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
            try {
                ProcessBuilder pb;
                Process proc;
                File fichero;
//                String texto = "Hola me llamo laura";
                StringBuilder texto = new StringBuilder();
                texto.append("Hola me llamo Laura");

                fichero = new File ("C:\\laura\\aa.txt");
                
                pb = new ProcessBuilder("cmd.exe", "/C", "type nul > C:\\laura\\aa.txt");
                proc = pb.start();
                pb = new ProcessBuilder("cmd.exe", "/C", "echo Hola me llamo laura > C:\\laura\\aa.txt ");
                proc = pb.start();
                
//                BufferedWriter bw;
//                
//                bw = new BufferedWriter(new FileWriter(fichero));
//		bw.write("Hola me llamo Laura");
//                
//                FileOutputStream fileOut;
//                fileOut = new FileOutputStream(fichero); 
//                ObjectOutputStream output = new ObjectOutputStream(fileOut); 
//                output.writeObject(texto);
//                output.close(); 
                
                
//                FileWriter fileWriter = new FileWriter("C:/Laura/aa.txt");
//		fileWriter.write("Hola me llamo Laura");
//
//                FileWriter fichero2 = null;
//                PrintWriter pw =null;
//                
//                fichero2 = new FileWriter ("C:/laura/aa.txt");
//                pw = new PrintWriter(fichero2);
//                pw.print("Hola me llamo laura");
//                pw.write("Hola me llamo laura");
//                pw.flush();
//                fichero2.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Actividad4.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Actividad1.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
}
