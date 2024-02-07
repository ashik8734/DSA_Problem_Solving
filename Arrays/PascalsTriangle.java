import java.util.*;
class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result= new ArrayList<>();

        if(numRows==0) return result;

        //Adding first row
        List<Integer> firstRow= new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows==1) return result;
        
        //Adding the remaning rows
        for(int i=1;i<numRows;i++){
            List<Integer> privRow=result.get(i-1);
            //Adding 1st element in current row
            List<Integer> row= new ArrayList<>();
            row.add(1);
            // Adding the remaining elements in current row
            for(int j=0;j<i-1;j++){
                row.add(privRow.get(j)+privRow.get(j+1));

            }
            //Adding last element in current row
            row.add(1);
            // adding the entire row in result
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans =generate(5);

        System.out.println(ans);
    }
}