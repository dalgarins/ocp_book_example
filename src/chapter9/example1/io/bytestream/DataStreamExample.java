package chapter9.example1.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {

    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.temp"))) {
            
            
            for (int i = 0; i < 10; i++) {
                
                dos.writeByte(i);
                dos.writeShort(i);
                dos.writeInt(i);
                dos.writeLong(i);
                dos.writeFloat(i);
                dos.writeDouble(i);                
            }
            
        } catch (FileNotFoundException ex) {
            
            System.err.println("Can not create with the given file name");
            System.exit(-1);
        } catch (IOException ex) {
            
            System.err.println("Error IO when processing the file");
            System.exit(-1);
        }
    
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.temp"));) {
            
            
            for (int i = 0; i < 10; i++) {
                
                System.out.printf("%d %d %d %d %g %g %n", dis.readByte(), dis.readShort(), dis.readInt(), dis.readLong(), dis.readFloat(), dis.readDouble());
            }
            
            
        } catch (FileNotFoundException ex) {
            
            System.err.println("Can not create with the given file name");
            System.exit(-1);
        } catch (IOException ex) {
            
            System.err.println("Error IO when processing the file");
            System.exit(-1);
        }
        
    }
    
}
