class addition {
	public static void main(String[] args){
		int a[][] = {{14,2,3},{4,5,6}};
		int b[][] = {{7,8,25},{7,11,5}};
		int c[][] = new int [2][3];
        int d[][] = new int [2][3];
        int e[][] = new int [2][3];
        int f[][] = new int [2][3];
		
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				c[i][j] = a[i][j] + b[i][j];
				d[i][j] = a[i][j] - b[i][j];
				e[i][j] = a[i][j] * b[i][j];
				f[i][j] = a[i][j] / b[i][j];
				
				
			}
		}

		System.out.println("addition is: ");
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		
        System.out.println("substraction is: ");
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.print(d[i][j]+ " ");
			}
			System.out.println();
		}
		
        System.out.println("multiplication is: ");
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.print(e[i][j]+ " ");
			}
			System.out.println();
		}
		
        System.out.println("division is: ");
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.print(f[i][j]+ " ");
			}
			System.out.println();
		}
			
		System.out.println("transpose of a is: ");
		for(int i=0; i<3; i++){
			for(int j=0; j<2; j++){
				System.out.print(a[j][i]+ " ");
			}
			System.out.println();
		}
	}
	
}





