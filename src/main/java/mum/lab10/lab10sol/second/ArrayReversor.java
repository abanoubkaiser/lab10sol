package mum.lab10.lab10sol.second;

public class ArrayReversor {
private FlattenArrayService faltternService=new FlattenArrayService();

    public ArrayReversor(FlattenArrayService faltternService) {
        this.faltternService = faltternService;
    }

     public int[] reverseArray(int[][] arr){
        int[] ans = faltternService.flattenArray(arr);
        int l = 0;
        int r = ans.length - 1;
        while (l < r){
            int temp = ans[l];
            ans[l] = ans[r];
            ans[r] = temp;
            l++;
            r--;
        }
        return ans;
    }
}
