
package com.mycompany.finalproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile extends Thread {
        File f;
        BufferedReader br;
        BufferedWriter bw;

    public WriteInFile(File f, BufferedReader br) {
        this.f = f;
        this.br = br;
    }

    @Override
    public void run() {
            try {
                this.Write();
            } catch (IOException ex) {
               System.out.println(ex.getMessage());
        }
        
    }
    
     private void Write() throws IOException{
            bw = new BufferedWriter(new FileWriter(f));
            
            String line;
            while ((line = br.readLine()) != null) {
                //to render html to string
                bw.write(line.replaceAll("(<.*?>)", ""));
                bw.newLine();
            }
}
     
     public void closeBW() {
        try {
            this.bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
     
}
