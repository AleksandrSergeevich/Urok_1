public class Main {

    public static void main(String[] args) {
        int a = 10;
        char c ='A';
        byte b = 5;
        short s = 20;
        long l = 3287;
        float f = 12.4f;
        double d = 14.675;
        boolean bool = false;

        Resultat ( );
        Vysokosnyi();
        Raznica();
        Vozvrat();
        plus_or_minus();
        Imya();
    }

        public static void Vysokosnyi() {
            int a = 2004;
            if (a % 100 == 0 && a % 400 == 0) {
                System.out.println("Высокосный год, дней в году: 366");

            } else if (a % 4 == 0 && a % 100 > 0) {
                System.out.println("Высокосный год, дней в году: 366");

            } else if (a % 100 == 0) {
                System.out.println("Не высокосный год, дней в году: 365");

            } else {
                System.out.println("Не высокосный год, дней в году: 365");
            }
        }

    public static boolean Raznica(){
        int a = 10;
        int b = 5;
        if(a + b >= 10 || a + b <= 20 ){
            return true;
        }else{
            return false;
        }
    }

    public static boolean Vozvrat(){
        int a = 10;

        if(a < 0 ){
            return true;
        }else{
            return false;
        }
    }

    public static void plus_or_minus(){
        int a = 0;

        if (a >= 0) {
            System.out.println(a + "  Положительное число");
        } else {
            System.out.println(a + "  Отрицательное число");
        }
    }

    public static void Imya() {
        String s = "Александр";
        System.out.println("Привет " + s + "!");
    }

    public static int Resultat ( ) {
        int a = 10;
        int b = 5;
        int c = 6;
        int d = 3;

        int i = a * (b + (c / d));
        return i;
    }
}
