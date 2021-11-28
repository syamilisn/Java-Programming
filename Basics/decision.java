class decision{
    public static void main(String[] args){
        if(false){
            System.out.println("Hi");
        }
        else{
            System.out.println("Else part");
        }

        int i=10,j=19,k=200,a=12,b=23,c=23,d=56;
        if (i == 10) {
			if (j < 20) a = b;
			if (k > 100) c = d;       // this if is
			else a = c;                   // associated with this else
			}
	    else a = d; 			           // this else refers to if(i == 10)
        System.out.println("a:"+a+" b:"+b+" c:"+c+" d:"+d);
    }

}