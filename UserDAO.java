
package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserDAO {
   
    
    public void Save(String ad,String soyad,String email,String password) throws IOException
    {
        
        File f = new File("Person");
        if (!f.exists()) {
            f.createNewFile();
            System.out.println("Dosya olusturuldu. ");
        } else {
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("/"+ad+"/"+soyad+"/"+email+"/"+password);
            bw.newLine();
            bw.close();
            System.out.println("Dosyaya yazildi.");
        }
    }
     public Boolean getData (String email,String password)
    {
       try {
            FileReader fileReader=new FileReader("Person");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            int i=0;
            while ((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("/");
                String mail=bilgiler[1];
                String pass=bilgiler[2];
                if (mail.equals(email)&&pass.equals(password))
                {
                    return true;
                }

            }
            reader.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
}
