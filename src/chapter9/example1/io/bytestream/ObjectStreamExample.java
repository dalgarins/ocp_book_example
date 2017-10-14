package chapter9.example1.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectStreamExample {


    public static void main(String[] args) {

        Map<String, String> presidentOfUS = new HashMap<>();
        presidentOfUS.put("Barack Obama", "2009 to --, Democratic");
        presidentOfUS.put("George Bush", "2001 - 2009, Republican");
        presidentOfUS.put("Bill Clinton", "1993 - 2001, Democratic");
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.temp"))) {
            
            oos.writeObject(presidentOfUS);
                        
        } catch (FileNotFoundException ex) {
            System.err.println("Can not create the file");
        } catch (IOException ex) {
            System.err.println("Error processing the file");
        }
        
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.temp"));) {
            
            Object obj = ois.readObject();
            
            if (obj != null && obj instanceof Map) {
                
                Map<?, ?> presidents = (Map<?, ?>) obj;
                System.out.println("President name \t description");
                presidents.forEach((k, v) -> {
                
                    System.out.printf("%s \t %s %n", k, v);
                });
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Can not create the file");
        } catch (IOException ex) {
            System.err.println("Error processing the file");
        } catch (ClassNotFoundException ex) {
            System.err.println("Can not recognoze the class");
        }
        
    }
    
}
