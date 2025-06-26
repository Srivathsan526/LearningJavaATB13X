package June25;

public class Lab002MinMax {
    public static void main(String[] args) {
        int s2[] = {18, 54, 134, 58, 99, 1, 165};
        int max_number = max_num(s2);
        System.out.println(max_number);
        int min_number = min_num(s2);
        System.out.println(min_number);
    }

    static int max_num(int s2[]) {
        int max = s2[0];
        for(int i = 0; i < s2.length; i++) {
            if (s2[i] > max) {
                max = s2[i];
            }
        }
            return max;

        }
    static int min_num(int s2[]) {
        int min = s2[0];
        for(int i = 0; i < s2.length; i++) {
            if (s2[i] < min) {
                min = s2[i];
            }
        }
        return min;

    }
    }
// 1.scanner array and 2.reverse array 3.sum 4.find the element 5. Palindrome  and 6.Copy array

