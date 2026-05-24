import java.util.* ;
import java.io.*; 

public class SquareRootOfNSolution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		
		 */
		
	
		long start = 0,end = N-1;
		long ans = 0;

		if(N == 1)return 1;

		while(start <= end){
			long mid = start + (end - start)/2;
			long square = mid*mid;

			if(square == N){
				return (int)mid;
			}

			else if(square < N){
				ans = mid;
				start = mid + 1;
			}

			else{
				end = mid - 1;
			}
		}
		return (int)ans;
		 
	}
}
