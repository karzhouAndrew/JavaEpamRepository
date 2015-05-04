package lab2;

/**
 * Определить является ли заданное числом простым
 */
public class Hometask2_4 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();*/
        int number = 113;
        boolean truth = true;

        if (number==0) {
            truth = false;
        }
        else {
            for (int i = 2; i < Math.sqrt(number)+1; i++) { //либо i < квадратный корень из number
                if (number % i ==0) {
                    truth = false;
                    break;
                }
            }
        }
        if (!truth) {
            System.out.println("Not simple");
        } else {
            System.out.println("Simple");
        }
    }
}
//либо через while до первого делителя - если делится без остатка, то число НЕ простое!