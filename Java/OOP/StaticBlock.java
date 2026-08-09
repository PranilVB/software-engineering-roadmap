public class StaticBlock {
    /**
     * InnerStaticBlock
     */
    
        static int a=5;
        static int b;
        static{
             b=10;
             System.out.println("this is a static block ");
            }
        public static void main(String[] args) {
            StaticBlock obj=new StaticBlock();
            System.out.println(StaticBlock.b/StaticBlock.a);
        }
                     
    }

