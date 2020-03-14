package mum.lab10.lab10sol.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener {

public  int[] flattenArray(int[][] arr){
		if(arr == null)
			return null;
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++) {
				res.add(arr[i][j]);
			}
		}
		int[] ans = new int[res.size()];
		int i = 0;
		for (int a: res){
			ans[i++] = a;
		}
		return ans;
	}

}
