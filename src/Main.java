import java.util.Scanner;

public class Main {
    static int memberVariable = 2;


    public static void main(String[] args) {
        // 1 vezi repository TemaLab1JavaV2
        // 2
        System.out.println("Exercitiul 2: \n");
        double result = sum(memberVariable, 3);
        System.out.println("Rezultatul adunarii este: " + sum(3, memberVariable));

        result = substract( 5, 4);
        System.out.println("Rezultatul scaderii este: " + result );

        result = multiply(3, 5);
        System.out.println("Rezultatul inmultirii este: " + result);

        result = divide(15, 2);
        System.out.println("Rezultatul impartirii este: " + result + "\n");


        //3
        System.out.println("Exercitiul 3: \n");
        String resultLogo = javaLogo();
        System.out.println(resultLogo + "\n");

        //4
        System.out.println("Exercitiul 4: \n");
        double average = average( );
        System.out.println("Media celor trei numere este: " + average + "\n");

        //5
        System.out.println("Exercitiul 5: \n");
        String resultGlass = glass();
        System.out.println(resultGlass + "\n");

        //6
        System.out.println("Exercitiul 6: \n");
        result = modulo(7, 2);
        System.out.println("Restul impartirii este: " + result + "\n");

        //7
        System.out.println("Exercitiul 7: \n");
        int celsius = temperatura (300);

        System.out.println("Temperatura in Celsius este: " + celsius + "\n");

        //8
        System.out.println("Exercitiul 8: \n");
        float metri = distanta(80);
        System.out.println("Distanta in metri este de: " + metri +"\n");

//        //9    Acest exercitiu este comentat deoarece nu am reusit inca sa gasesc
//        o metoda de a returna "multiple return statements" care sa functioneze.
//        Cea mai plauzibila metoda mi se pare cea de a returna "array" dar nu am avut
//        timp sa o studiez destul.


//        System.out.println("Exercitiul 9: \n");
//        float [] viteza = float viteza( );



    }


    //2
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



    // 3
    public static String javaLogo () {
        String resultLogo = ("" +
                "   J    a   v     v  a\n" +
                "   J   a a   v   v  a a\n" +
                "J  J  aaaaa   v v  aaaaa\n"  +
                " JJ  a     a   v  a     a");
        return resultLogo;

    }



    //4
    public static double average(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu trei numere ");

            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            double average = (x + y + z) / 3;
            return average;
    }




    //5
    public static String glass () {
        String resultGlass = ("  +\"\"\"\"\"+\n" +
                " [| ° ° |] \n" +
                "  |  ^  | \n"  +
                "  | '_' | \n" +
                "  +-----+");
        return resultGlass;

    }

    //6
    public static int modulo (int firstNumber, int secondNumber){
        int result = firstNumber % secondNumber;
        return result;

    }

    //7
    public static int temperatura (int fahrenheit){

        int celsius = ((fahrenheit-32)*5/9);
        return celsius;

    }


    //8
    public static float distanta (float inch){
        float metri = (inch * 0.0254F);
        return metri;


    }

    //9
//    public static float [] viteza (float mps, float kmph, float mph){
//        Scanner scanner = new Scanner(System.in);
//
//        float timpSecunde;
//
//        System.out.println("Introdu distanta in metri: ");
//        float distanta = scanner.nextFloat();
//
//        System.out.println("Introdu numarul de ore: ");
//        float hr = scanner.nextFloat();
//
//        System.out.println("Introdu numarul de minute: ");
//        float min = scanner.nextFloat();
//
//        System.out.println("Introdu numarul de secunde: ");
//        float sec = scanner.nextFloat();
//
//        scanner.close();
//
//
//        timpSecunde = (hr * 3600) + (min * 60) + sec;
//
//        float mps = distanta / timpSecunde;
//        float kmph = ((distanta / 1000f) / (timpSecunde / 3600f));
//        float mph = ((distanta / 1000f) / (timpSecunde / 3600f)) / 1.609F;
//
//
//        float [] array = new float [3];
//        array[0] = mps;
//        array[1] = kmph;
//        array[2] = mph;
//        return array;
//
//    }
}