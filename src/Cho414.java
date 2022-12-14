import java.util.ArrayList;

public class Cho414 {
    public static int[] flatten(int[][][]arr){
        ArrayList<Integer> fla=new ArrayList<>();
      for(int[][]x:arr){
         for(int[]y:x){
             for(int z:y){
                fla.add(z);
             }
         }
      }
      int[]result=new int [fla.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]=fla.get(i);

        }
        return result;
    }
    public static void main(String[] args) {
        int[][][]arr={{{1,2},{3,4},{5,6}},
                    {{7,8},{9,10}},
                    {{3,4},{4,1}},
                    {{},{43,13}}};
        int[ ]flattenArray=flatten(arr);
        for(int n:flattenArray){
            System.out.print(n+" ");
        }
    }
}
