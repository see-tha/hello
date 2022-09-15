package Day6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1
{
    public static void main(String[] args)
    {
        List<String> name = new ArrayList<>(Arrays.asList("S", "E", "E", "T", "H", "A"));
        String a = "L";
 
        name.add(a);
        System.out.println(name);
    }
}


