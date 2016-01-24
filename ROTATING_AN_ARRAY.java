package eHealth;
import static java.lang.System.*;

public class ROTATING_AN_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] result = rotateArray(input,3);
		for(int i=0;i<result.length;i++){
        	out.println(result[i]);
        }
	}
	
	static int[] rotateArray(int[] array1,int positions){
		int[] result = null;
		if(array1.length>=positions){
			result = new int[array1.length];
			int startP = (array1.length - positions);
			int index = 0;
			for(int i= startP;i<array1.length;i++){
				result[index] = array1[i];
				index++;
			}
			for(int i=0;i<startP;i++){
				result[index]=array1[i];
				index++;
			}
		}else{
			out.println("Array length is less than rotate count");
			
		}
		return result;
			
	}

}
