package strsequence;


class Strbuild 
{
	
	void firstRun() {
		System.out.println("=== First Pass ===");
    	for (int i=1; i <= 5; i++) {
    		
    		for (int j=1; j <= (5-i); j++) {
    			System.out.print(".");
    		}
    		
    		for (int k=1; k <= i; k++) {
        		System.out.print(i);
        	}
    		System.out.println();   
    	}
    	System.out.println("========"); 
	}
	
	void secRun(int max) {
		
		System.out.println("==== Second Pass ====");
    	for (int i=1; i <= max; i++) {
    		StringBuffer sb1 = new StringBuffer("");
    		StringBuffer sb2 = new StringBuffer("");
    		for (int j=1; j <= (max); j++) {
    			if ( j <= (max-i) ) {
    				sb1.append(".");
    			}
    			else {
    				sb2.append(String.valueOf(i));
    			}
    		}
    		sb1.append(sb2);
    		System.out.println(sb1);
    		
    	}
    	System.out.println("========");
	}
	
    public static void main(String[] args) 
    {
    	Strbuild strb = new Strbuild();
    	strb.firstRun();
    	strb.secRun(8);
    		 
    }       
}      
   