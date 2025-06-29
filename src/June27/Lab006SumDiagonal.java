package June27;

public class Lab006SumDiagonal {
    public static void main(String[] args) {
        int [][] array= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length;j++){
                if(i==j){
                   sum = sum + array[i][j];
                }
            }
        }
        System.out.println("Sum of the diagonal of the array is " + sum);
    }
}
