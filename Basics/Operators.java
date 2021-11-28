class Operators{
    void logicalAnd(){
        System.out.println("0 & 0 = "+ (0 & 0));
        System.out.println("0 & 1 = "+ (0 & 1));
        System.out.println("0 & 1 = "+ (1 & 0));
        System.out.println("0 & 1 = "+ (1 & 1));
        System.out.println();
    }
    
    void logicalOr(){
        System.out.println("0 | 0 = "+ (0 | 0));
        System.out.println("0 | 1 = "+ (0 | 1));
        System.out.println("0 | 1 = "+ (1 | 0));
        System.out.println("0 | 1 = "+ (1 | 1));
        System.out.println();
    }

    void logicalXor(){
        System.out.println("0 ^ 0 = "+ (0 ^ 0));
        System.out.println("0 ^ 1 = "+ (0 ^ 1));
        System.out.println("0 ^ 1 = "+ (1 ^ 0));
        System.out.println("0 ^ 1 = "+ (1 ^ 1));
        System.out.println();
    }

    void logicalNot(){
        boolean x= true, y= false; 
        System.out.println("not true = "+!x);
        System.out.println("not false = "+!y);
    }
    public static void main(String [] args){
        Operators obj=new Operators();
        obj.logicalAnd();
        obj.logicalOr();
        obj.logicalXor();
        obj.logicalNot();
    }
}