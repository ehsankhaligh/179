
public class IMath {/**     * Returns an integer to the square root of x (discarding the fractional parts)    */   
	public int isqrt(int x) {       
		int guess = 1;       
		while (guess * guess < x) {            
			guess++;       
		}       
		return guess;   
	}
}

