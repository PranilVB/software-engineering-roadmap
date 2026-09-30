public class CountCharacterTypes {
    public static void main(String[] args) {
        String str="Password@2026";
        Counter(str);
    }
    static void Counter(String str){
        int i=0;
        int UpperCounter=0;
        int LowerCounter=0;
        int SpecialCounter=0;
        int DigitCounter=0;
        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            if(Character.isUpperCase(ch)){
                UpperCounter++;
            }
           else if(Character.isLowerCase(ch)){
                LowerCounter++;
            }
           else if(Character.isDigit(ch)){
                DigitCounter++;
            }
            else{
                SpecialCounter++;
            }
        }
        System.out.println("No of Upper case is "+UpperCounter);
        System.out.println("No of Lower case is "+LowerCounter);
        System.out.println("No of Special is "+SpecialCounter);
        System.out.println("No of Digit Counter is "+DigitCounter);
    }
    }

