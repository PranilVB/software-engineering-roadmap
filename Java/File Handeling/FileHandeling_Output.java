import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class FileHandeling_Output {
    public static void main(String[] args) {
        //Output stereme writer
    //     OutputStream os=System.out;
    //     System.out.println();
    //     try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
    //         osw.write("Hello world  ");
    //         osw.write(97);/*aski for character a */
    //         osw.write(10);/*new Line  */
    //         osw.write('A');
    //         osw.write('\n');
    //         char[] arr ="Hello world".toCharArray();
    //         osw.write(arr);
    //         // osw.write(🥳);
    //    }
    //    catch(IOException e){
    //     System.out.println(e.getMessage());
    //    }



       //File writer
    //            try(FileWriter fw=new FileWriter("Note.txt",true)){
    //         fw.write("Hello world This will be appended as boolean append is set to true  ");

    //    }
    //    catch(IOException e){
    //     System.out.println(e.getMessage());
    //    }




    //Buffer writer
                   try(BufferedWriter bw=new BufferedWriter(new FileWriter("Note.txt"))){
            bw.write("Hello world ");

       }
       catch(IOException e){
        System.out.println(e.getMessage());
       }
    }
}
