package June30;

public class Lab001oops {
    public static void main(String[] args) {

        String name = "sri";
        int age = 33;
        int height = 167;
        boolean is_married = true;

        int bmi2 = bmi(height, age);
        System.out.println("BMI is " + bmi2);

        String s2 = active(age);
        System.out.println(s2);
    }
        void eat() {
            System.out.println("Vegetarian");
        }

        public static String active ( int age){
            //System.out.println("MayBe");
            return "MayBe";
        }

        public static int bmi (int height, int age){
            int bmi1 = height / age;
            return bmi1;

        }
    }

