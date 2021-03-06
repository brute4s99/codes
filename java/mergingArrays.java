package TimeAndSpace;

public class mergingArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		int []one={10,15,30,45,55};
//		int []two={16,18,32,35,40};
//		int []result=mergeArrays(one, two);
//		for(int i=0; i<result.length;i++){
//			System.out.print(result[i]+"   ");
//		}
		
		int []arr={5,18,2,9,0};
		int []sortedArr=mergeSort(arr, 0, arr.length-1);
		display(sortedArr);		
		
		
	}
	
	private static void display(int[] arr) {

		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"   ");
		}
		System.out.println("!!");
	}

	public static int[] mergeArrays(int []one, int []two){
		int []result=new int[one.length+two.length];
		int ctrOne=0;
		int ctrTwo=0;
		int ctrResult=0;
		
		while(ctrOne<one.length && ctrTwo<two.length){
			if(one[ctrOne]<two[ctrTwo])
				result[ctrResult++]=one[ctrOne++];
			else
				result[ctrResult++]=two[ctrTwo++];
		}
		
		while(ctrOne<one.length){
			result[ctrResult++]=one[ctrOne++];
		}
		
		while(ctrTwo<two.length){
			result[ctrResult++]=two[ctrTwo++];
		}
		
		return result;
	}

	public static int[] mergeSort(int []arr, int lo, int hi){
		
		if(lo==hi){

			int []baseArr=new int[1];
			baseArr[0]=arr[lo];
			return baseArr;
		}
		
		int mid = (lo+hi)/2;
		int []firsthalfSortedArr=mergeSort(arr, lo, mid);
		int []sechalfSortedArr=mergeSort(arr, mid+1, hi);
		int []fullSortedArr=mergeArrays(firsthalfSortedArr, sechalfSortedArr);
		
		return fullSortedArr;
	}

	
}
