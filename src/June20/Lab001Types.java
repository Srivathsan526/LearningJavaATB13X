package June20;

public class Lab001Types {
    public static void main(String[] args) {

        no_parameter_no_returntype();
        parameter_no_returntype(1,2);

        String type3 = no_parameter_returntype();
        System.out.println(type3);

        int type4 = parameter_returntype(5,3);
        System.out.println(type4);


    }

    static void no_parameter_no_returntype() {
        System.out.println("1: No Parameters, No return type");
    }

    static void parameter_no_returntype(int a, int b){
        System.out.println("2: With Parameters, No return type");
        System.out.println(a+b);
    }
    static String no_parameter_returntype() {
        System.out.println("3: No Parameter, But with return type");
        return "Hi, How are you?";
    }
    static int parameter_returntype(int c, int d){
        System.out.println("4: With Parameter and return type");
        return c+d;
    }
}