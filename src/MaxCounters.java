
public class MaxCounters {
	public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        int max = 0;
        int lastMax = 0;
        for(int x : A){
            if(x >= 1 && x <= N){
                counters[x-1] = Math.max(counters[x-1], lastMax);
                counters[x-1]++;
                max = Math.max(counters[x-1], max);
            }
            else if(x == N+1){
                lastMax = max;
            }
        }
        
    for(int i = 0 ; i < N ; i++){
        counters[i] = Math.max(counters[i], lastMax);
    }
        return counters;
    }
}
