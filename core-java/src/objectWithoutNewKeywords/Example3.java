package objectWithoutNewKeywords;
import java.lang.reflect.Constructor;

public class Example3 {
    public void display() {
        System.out.println("Object created using Constructor.newInstance()");
    }

    public static void main(String[] args) {
        try {
            Constructor<Example3> constructor = Example3.class.getDeclaredConstructor();
            Example3 example = constructor.newInstance();
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}