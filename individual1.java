import java.io.FileOutputStream;
import java.io.ObjectOutputstream;
 
individual individual1 = new individual("Hari",25);
 try (FileOutputStream fos = new FileOutputStream("individual1.bin");
 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
     oos.writeObject(individual1);
 }
