import java.util.ArrayList;

public class PersonModel<T> {
    public ArrayList<T> al = new ArrayList<T>();
    public void add(T obj) {
        al.add(obj);
    }
    public void display() {
        for (T object : al) {
            System.out.println(object);
        }
    }


}
