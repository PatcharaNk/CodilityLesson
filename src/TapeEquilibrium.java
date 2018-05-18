
public class TapeEquilibrium {
	public int solution(int[] A) {
		int result = 0;
		int sum1 = A[0];
		int sum2 = 0;
		//sum tap2
		for(int i = 1 ; i < A.length ; i++) {
			sum2 += A[i]; 
		}
		//set result
		result = Math.abs(sum1-sum2);
		
		for(int p = 1 ; p < A.length ; p++) {
			if(result > Math.abs(sum1-sum2)) {
				result = Math.abs(sum1-sum2);
			}
			sum1 += A[p];
			sum2 -= A[p];
		}
		
		return result;
	}
}
