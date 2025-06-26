package June25;

public class Lab003CopyArray {
    public static void main(String[] args) {
int[] s3 = {1,2,3};
int[] s4 = new int[s3.length];
System.arraycopy(s3, 0, s4, 0, s3.length);
for(int i=0;i<s3.length;i++) {
    System.out.println(s4[i]);
}
    }
}
