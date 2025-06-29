package June27;
// to be changed
public class Lab004 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i<=n; i++){
            if(n%2 != 0 ){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
