import java.util.HashSet;
public class MissingInteger {
	public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> elementsA = new HashSet<Integer>();
        int min = 1;
        for(int x : A){
            if(x > 0)
                elementsA.add(x);
        }
        
        for(int i = 1 ; i<Integer.MAX_VALUE; i++){
            if(!elementsA.contains(i))
                return i;
        }
        return min;
        
    }
}
