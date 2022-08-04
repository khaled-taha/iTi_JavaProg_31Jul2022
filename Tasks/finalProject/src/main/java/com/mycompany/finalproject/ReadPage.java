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
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadPage extends Thread {

    private File f;
    private String urlString;
    private URL url;
    private URLConnection urlc;
    private BufferedReader br = null;

    public ReadPage(File f, String urlString) {
        this.f = f;
        this.urlString = urlString;
    }

    @Override
    public void run() {
        try {
            this.Read();
        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
    }
    
    private void Read () throws IOException{
            url = new URL(this.urlString);
            urlc = url.openConnection();
            InputStreamReader reader = new InputStreamReader(urlc.getInputStream(), StandardCharsets.UTF_8);
            br = new BufferedReader(reader);
    }

    public BufferedReader getBr() {
        return br;
    }
    
      public void closeBr() {
        try {
            this.br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
     }
    

