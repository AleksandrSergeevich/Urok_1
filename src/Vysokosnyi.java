public class Vysokosnyi {
    public static void main(String[] args) {

        int a = 2004;
        if (a %100==0 && a %400 ==0 ) {
            System.out.println("Высокосный год, дней в году: 366");

        }else if (a % 4 == 0 && a % 100 > 0) {
            System.out.println("Высокосный год, дней в году: 366");

        }else if (a % 100 == 0) {
            System.out.println("Не высокосный год, дней в году: 365");

        }else {
            System.out.println("Не высокосный год, дней в году: 365");
        }
    }
}
