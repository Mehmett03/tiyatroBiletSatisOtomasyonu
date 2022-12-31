/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class OyunDAO {
    public void Save(String id1,String id2,String id3,String id4) throws IOException
    {
        
        File f = new File("Oyunlar");
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Dosya olusturuldu. ");
        } else {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("/"+id1+"/"+id2+"/"+id3+"/"+id4);
            bw.newLine();
            bw.close();
            System.out.println("Dosyaya yazildi.");
        }
    }
  
}
