class pattern12{
	public static void main(String args[]){
		int n =5;
		for(int i=1; i<=n; i++){
			
			for(int j=(n-i); j>0;j--){
					System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=n-1; a>0; a--){
			
			for(int j=(n-a); j>0;j--){
					System.out.print(" ");
			}
			
			for(int j=1; j<=a; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
		
}

