class pattern18 {
    public static void main(String args[]){
        int n =5;
        int alphabet =  64;

    for(int i=1; i<=n; i++){

       

        for(int j=1; j<=n+1-i; j++){
            System.out.print((char)(j+alphabet)+ " ");
         
        }
        System.out.println("");
    }

    }
}