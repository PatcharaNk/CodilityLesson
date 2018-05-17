
public class PermMissingElem {
	public int solution(int[] A) {
		int Dsum = 0;
	    int sum = 0;
        for(int i = 0 ; i < A.length ; i++){
            sum += i+1;
            Dsum += A[i];
        }
        sum += A.length+1;
        return sum-Dsum;
    }
}
