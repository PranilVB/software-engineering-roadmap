public class Subsequence {
    public static void main(String[] args) {
        String str="ABCD";
        SS("",str);
    }
    static void SS(String pro,String str){
        if(str.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch=str.charAt(0);
        SS(pro+ch, str.substring(1));
        SS(pro, str.substring(1));
    }
}
