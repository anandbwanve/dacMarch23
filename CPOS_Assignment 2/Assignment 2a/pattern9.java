class pattern9{
	public static void main(String args[]){
		int n =5;
		int alphabet =64;
		for(int i=1; i<=n; i++){

            for(int j= (n-i);j>0;j--){
                System.out.print(" ");
            }

			for(int j=1; j<=i; j++){
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}
		
}