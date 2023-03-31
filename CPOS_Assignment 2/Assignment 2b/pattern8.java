class pattern8{
	public static void main(String args[]){
		int n=5;
		for (int i=1; i<=n; i++){

            for(int j=(n-i); j>=1 ; j--){
                System.out.print(" ");
            }

            for(int k=i; k>=1;k--){

            System.out.print(n-k+1+ " ");

            }
            System.out.println();
        } 

    }
}
