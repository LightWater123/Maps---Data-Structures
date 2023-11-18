import java.util.*;

public class activity 
{
    public static void main(String[]args)
    {
        Map<String, String> programs = new HashMap<>();

        programs.put("BSIT","Bachelor of Science in Information Technology");
        programs.put("BSCS","Bachelor of Science in Computer Science");
        programs.put("BSIS","Bachelor of Science in Information Systems");
        
        programs.remove("BSIT");
        System.out.println(programs.keySet());

        if(programs.containsKey("BSCpE"))
        {
            System.out.println("This map contains BSCpE");
        }else{
            System.out.println("This map does not contain BSCpE");
        }
    }
}