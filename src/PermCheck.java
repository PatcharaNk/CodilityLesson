
public class PermCheck {
	public int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] bitmap = new boolean[A.length];
        for(int x : A){
            if(x>A.length) return 0;
            bitmap[x-1] = true;
        }
        for(boolean i : bitmap){
            if(!i) return 0;
        }
        return 1;
    }
}
