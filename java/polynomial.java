package TimeAndSpace;

public class polynomial {

	public static void main(String[] args) {
		poly(2,8);
	}
	
	public static void poly(int x, int n){
		
		int sum=0;
		int X=x;
		
		for(int i=n; i>0; i--){
			sum=sum+(i*X);
			X=X*x;
		}
		
		System.out.println(sum);
	}

}
