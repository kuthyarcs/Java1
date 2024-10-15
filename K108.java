import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class K108 {
    public static void main(String[] args) throws FileNotFoundException{
        File f1=new File("names.txt");
        Scanner sc1= new Scanner(f1);
        List<String> list1=new ArrayList<>();
        String s1="";
        for (int i=0; i<3; i++){
            s1=sc1.nextLine();
            list1.add(s1);          
        }
        System.out.println(list1);
        
        
    }
    
}
