class pattern13{
	public static void main(String args[]){
		int n =5;
	
		for(int a=n; a>0; a--){
			
			for(int b=(n-a); b>0;b--){
					System.out.print(" ");
			}
			
			for(int c=1; c<=a; c++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
			for(int i=1; i<=n; i++){
			
			for(int j=(n-i); j>0;j--){
					System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
		
}

