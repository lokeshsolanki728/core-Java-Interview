package objectWithoutNewKeywords;
import java.io.*;

public class Example2 implements Serializable {
    public void display() {
        System.out.println("Object created using deserialization");
    }

    public static void main(String[] args) {
        try {
         
            Example2 original = new Example2();
            FileOutputStream fos = new FileOutputStream("Example2.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(original);
            oos.close();

            FileInputStream fis = new FileInputStream("Example2.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Example2 deserialized = (Example2) ois.readObject();
            ois.close();

            deserialized.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}