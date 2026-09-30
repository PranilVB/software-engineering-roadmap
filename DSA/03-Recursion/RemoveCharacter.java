/**
 * RemoveCharacter
 */
public class RemoveCharacter {

    public static void main(String[] args) {
        String str="Hello everyone";
        char ch='e';
        String str2="";
        RC(str,str2, ch);
        
    }
    static void RC(String str,String str2,char ch){
        if(str.isEmpty()){
            System.out.println(str2);
            return ;
        }
        char chr=str.charAt(0);
        if(chr==ch){
            RC(str.substring(1), str2, ch);
        }
        else{
            RC(str.substring(1), str2+chr, ch);
        }
    }
}