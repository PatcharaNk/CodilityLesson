import java.util.*;
public class Distinct {
	public int solution(int[] A) {
        // write your code in Java SE 8

        if(A.length == 0){
            return 0;
        }
        if(A.length == 1){
            return 1;
        }
        Arrays.sort(A);
        int count = 1;
        for(int i = 0 ; i < A.length-1; i++){
            if(A[i] != A[i+1]){
                count++;
            }
        }
        return count;
    }
}
