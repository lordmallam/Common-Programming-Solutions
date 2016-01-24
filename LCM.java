package eHealth;
import static java.lang.System.*;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input ={1,2,3,4,5,6,7,8,9,10};
     int result = arraylcm(input,0,input.length);
     out.println(result);
	}
	
	public static int gcd(int a, int b){
	    if (a<b) return gcd(b,a);
	    if (a%b==0) return b;
	    else return gcd(b, a%b);
	}
	
	public static int lcm(int a, int b){
	    return ((a*b)/gcd(a,b));

	} 
	
	public static int arraylcm(int[] array1, int start, int end){
	    if ((end-start)==1) return lcm(array1[start],array1[end-1]);
	    else return (lcm (array1[start], arraylcm(array1, start+1, end)));
	}

}
