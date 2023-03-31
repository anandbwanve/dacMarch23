class maxmin {
public static void main(String args[]){
	int a[] = {2,3,4,5,6,7,8,9,11,15,22,17,5,1};
	int max = a[0];
	int min = a[0];
	for (int i =0;i<a.length; i++){
		if (a[i]> max){
			max = a[i];
		}
		
		if (a[i]<min){
			min = a[i];
		}
	}
	System.out.println("Maximum is :" + max);
	System.out.println("Minimum is :" + min);
	}
}