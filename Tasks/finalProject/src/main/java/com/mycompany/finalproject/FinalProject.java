package com.mycompany.finalproject;

import java.io.File;
import java.io.IOException;

public class FinalProject {

    public static void main(String[] args) {
        
        try {
            File f = new File("content.txt");
            f.createNewFile();
            
            ReadPage readPage = new ReadPage(f, "https://introcs.cs.princeton.edu/java/92symbolic/Rational.java.html");
            readPage.start();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        

        

    }
}