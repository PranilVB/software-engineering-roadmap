import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileHandeling_Output {
    public static void main(String[] args) {
        OutputStream os=System.out;
        System.out.println();
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello world  ");
            osw.write(97);/*aski for character a */
            osw.write(10);/*new Line  */
            osw.write('A');
            osw.write('\n');
            char[] arr ="Hello world".toCharArray();
            osw.write(arr);
            // osw.write(🥳);
       }
       catch(IOException e){
        System.out.println(e.getMessage());
       }
    }
}
