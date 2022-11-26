import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
    public static void main (String[]args){

        List<String>names = new ArrayList<>();
        names.add("Олег");
        names.add("Сергей");
        names.add("Василий");
        System.out.println(listEdit(names));
    }

    public static List<String> listEdit(List<String> names) {
        for( int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).substring(1));
        }

        Collections.sort(names);
        return names;
    }
}

