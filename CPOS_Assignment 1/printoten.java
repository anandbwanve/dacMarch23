class printoten {
	public static void main (String[] agrs){
		printoten.printwithoutloop(1);
	}
	
 public static void printwithoutloop (int n){
	 if(n <= 10){
		 System.out.println(n);
		 printwithoutloop(n+1);
	 }
 }
}