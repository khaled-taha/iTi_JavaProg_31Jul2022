package com.mycompany.finalproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;


public class ReadPage extends Thread implements Runnable {

    File f;
    String urlString;
    URL url;
    URLConnection urlc;
    BufferedReader br = null;
    BufferedWriter bw = null;

    public ReadPage(File f, String urlString) {
        this.f = f;
        this.urlString = urlString;
    }

    @Override
    public void run() {
        try {
            this.Read();
            this.Write();
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }finally {
            try {
                br.close();
                bw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
     }
    }
    
    private void Read () throws IOException{
            url = new URL(this.urlString);
            urlc = url.openConnection();

            InputStreamReader reader = new InputStreamReader(urlc.getInputStream(), StandardCharsets.UTF_8);
            br = new BufferedReader(reader);

    }
    
    
     private void Write() throws IOException{
            bw = new BufferedWriter(new FileWriter(f));
            
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
     }
    
}
