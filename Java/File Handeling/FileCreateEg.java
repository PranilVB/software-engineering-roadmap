import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateEg {
    public static void main(String[] args) {
        try  {
            File fo=new File("File_Created.txt");
            fo.createNewFile();
        } catch (IOException e) {
        System.out.println(e.getMessage());        
    }
    try {
        FileWriter fw=new FileWriter("File_Created.txt");
        fw.write("雲の上はいつも青空");
        fw.write("\nAbove the clouds sky is always blue");
        fw.close();
    } catch (IOException e) {
        System.out.println(e.getMessage());        
    }

    try {
        BufferedReader br=new BufferedReader(new FileReader("File_Created.txt"));
        while (br.ready()) {
            System.out.print(br.readLine());
        }
    } catch (IOException e) {
System.out.println(e.getMessage());    }

        try  {
            File fo=new File("FileDelete.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
        System.out.println(e.getMessage());        
    }
    }
}
