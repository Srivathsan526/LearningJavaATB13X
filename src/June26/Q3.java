package June26;
//Created with the help of ChatGPT
public class Q3 {
    public static void main(String[] args) {
        int iterations = 1000;

        String str = "";
        long starttime = System.nanoTime();
        for(int i = 0; i < iterations; i++){
            str += "x";
        }
        long endtime = System.nanoTime();
        long stringTime = (endtime - starttime)/1000000;
        System.out.println("String Performance Time is: " + stringTime);

        StringBuilder sb = new StringBuilder();
        starttime = System.nanoTime();
        for(int i = 0; i < iterations; i++){
            sb.append("x");
        }
        endtime = System.nanoTime();
        long stringBuilderTime = (endtime - starttime)/100000;
        System.out.println("String Builder Performance Time is " + stringBuilderTime);

        StringBuffer sbf = new StringBuffer();
        starttime = System.nanoTime();
        for(int i = 0 ; i < iterations ; i++){
            sbf.append("x");
        }
        endtime = System.nanoTime();
        long stringBufferTime = (endtime - starttime)/100000;
        System.out.println("StringBuffer performance is " + stringBufferTime);



    }
}
