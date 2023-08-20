import java.io.FileInputStream;
import java.io.ObjectInputStream;
Person person;
try (FileInputStream fis = new FileInputStream("person.bin");
     ObjectInputStream ois = new ObjectInputStream(fis)) {
  person = (Person) ois.readobject();
}
