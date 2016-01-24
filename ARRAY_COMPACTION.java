package eHealth;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class ARRAY_COMPACTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] input = {1,3,5,5,5,6,6,7,8,8,9,9,9,15,16,16,17};
        int [] result = shrink(input);
        for(int i=0;i<result.length;i++){
        	out.println(result[i]);
        }
	}
	
	static int[] shrink(int[] array1){
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(array1[0]);
		for(int i=1;i<array1.length;i++){
			if(!myList.contains(array1[i])){
				myList.add(array1[i]);
			}
		}
		int[] result = new int[myList.size()];
		for(int j=0;j<result.length;j++){
			result[j] = myList.get(j);
		}
		return result;
	
	}
	

}
