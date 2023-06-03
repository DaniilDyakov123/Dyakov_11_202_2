import java.lang.reflect.Method;
import java.util.HashSet;
public class Task2 {
    public static void main(String[] args) throws ClassNotFoundException {
        String input = "java.lang.String";
        Class c = Class.forName(input);
        HashSet<String> name = new HashSet<>();
        for (Method method : c.getMethods()) {
            name.add(method.getName());
        }
        System.out.println(name);
    }
}
