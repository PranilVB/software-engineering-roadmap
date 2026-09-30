import java.util.*;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String str=sc.nextLine();
        VovelCounter(str.toLowerCase());
    }
    static void VovelCounter(String str){
        int Vovel=0;
        for (int b = 0; b < str.length(); b++) {
            char j=str.charAt(b);
            switch (j) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                                    Vovel++;
                                    break;
                    
            
                default:
                                                        break;
            }
            }
            System.out.println(Vovel);
        }
    }

