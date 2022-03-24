public class Main {
    static int memberVariable = 2;


    // 2
    public static void main(String[] args) {

        String result = javaLogo1();
        System.out.println(result);
//        String result = javaLogo2();
//        System.out.println();


//        double result = sum(memberVariable, 3);
//        System.out.println(result);
//        System.out.println("Rezultatul este: " + sum(3, 5)+ "\n");
//
//
//        result = substract( 5, 4);
//        System.out.println(result +"\n");
//
//        result = multiply(3, 5);
//        System.out.println(result+ "\n");
//
//        result = divide(15, 2);
//        System.out.println(result+ "\n");
//
//        result = modulo(7, 2);
//        System.out.println(result+ "\n");

    }

    public static double sum(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    public static int substract (int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        return result;

    }

    public static int multiply (int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;


    }

    public static double divide (double firstNumber, double secondNumber){
        double result = firstNumber / secondNumber;
        return result;

    }

    public static int modulo (int firstNumber, int secondNumber){
        int result = firstNumber % secondNumber;
        return result;

    }

    // 3
    public static String javaLogo1 () {
        String result = ("" +
                "   J    a   v     v  a\n" +
                "   J   a a   v   v  a a\n" +
                "J  J  aaaaa   v v  aaaaa\n"  +
                " JJ  a     a   v  a     a");
        return result;

    }
//    public static String javaLogo2 () {
//        String line1 = ("   J    a   v     v  a");
//        String line2 = ("   J   a a   v   v  a a");
//        String line3 = ("J  J  aaaaa   v v  aaaaa");
//        String line4 = (" JJ  a     a   v  a     a");
//    return line1, line2, line3, line4;
//
//    }
}