public class Main {

    private static int[] swapValues(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a, b};
    }

    private static void printValues(int a, int b) {
        System.out.printf("A = %d, B = %d\n", a, b);
    }

    private static void processSecondTask() {
        System.out.println("============Задание 2============");
        int a = 4;
        int b = 3;
        printValues(a, b);
        int[] res = swapValues(a, b);
        printValues(res[0], res[1]);
    }

    private static void processThirdTask() {
        System.out.println("============Задание 3============");
        String str = "лес";
        boolean res = isPalindrome(str);
        System.out.println("Строка " + str + (res ? " полиндром" : " не полиндром"));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        processSecondTask();
        processThirdTask();
    }
}