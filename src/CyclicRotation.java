public class CyclicRotation {
	public CyclicRotation() {
		
	}
	
	public int[] solution(int[] A, int K) {
		int[] result = A;
		for(int i = 0 ; i < K ; i++) {
			result = rotation(A);
		}
		return result;
	}
	
	public int[] rotation(int[] A) {
		int[] R = A;
		if(A.length>0){
			int last = A[A.length-1];
			if(A.length > 1){
				for(int i = A.length-2 ; i >= 0 ; i--) {
					A[i+1] = A[i];
				}
				A[0] = last;
			}
		}
		return R;
	}
}
