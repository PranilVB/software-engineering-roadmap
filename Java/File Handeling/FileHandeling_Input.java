import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandeling_Input  {
    public static void main(String[] args) {
    // try(InputStreamReader irs=new InputStreamReader(System.in)){     
    //     System.out.println("Enter some letters :");
    //     int letter=irs.read();
    //     while (irs.ready()) {
    //         System.out.println((char)letter);
    //         letter=irs.read();
    //     }
    //     irs.close();
    //     System.out.println();
    // }
    // catch(IOException e){
    //     System.out.println(e.getMessage());
    // }    



    
    // try(FileReader fr=new FileReader("Note.txt")){
    //     int letter=fr.read();
    //     while (fr.ready()) {
    //         System.out.print((char)letter);
    //         letter=fr.read();
    //     }
    //     fr.close();
    //     System.out.println();
    // }
    // catch(IOException e){
    //     System.out.println(e.getMessage());
    // }    





    // try(BufferedReader br=new BufferedReader (new InputStreamReader(System.in))){
    //     System.out.println("Typed text is :"+br.readLine());
    // }catch (IOException e) {
    //         System.out.println(e.getMessage());
        
    // }



    try(BufferedReader br=new BufferedReader (new FileReader("Note.txt"))){
        while (br.ready()) {
          System.out.println( br.readLine());
        }
    }catch (IOException e) {
            System.out.println(e.getMessage());
        
    }
    }   
}

