//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int n = 1;
//        while (n <= 20) {
//            if (n % 3 == 0) {
//                System.out.println(n);
//            }
//            n++;
//        }
//        int num;
//        do {num = (int) (Math.random() * 1200);
//            System.out.println("Случайное число: " + num);
//        } while (num <= 1000);
//        System.out.println("Число больше 1000: " + num);
//        int num = 1;
//        int sum = 0;
//        while (num <= 100){
//            sum += num;
//            num++;
//        }
//        System.out.println(sum);
//_________________________________________________________________________________________________________________________

        int num = 1;
        while (num <= 50){
            if (num%2 == 0){
                System.out.println(num);
            }
            num++;
        }

        int count = 0;
        int num1 = 1;
        do {
            if (num1 % 7 == 0){
                count++;
            }
            num1++;
        } while (num1 <= 100);
        System.out.println(count);
    }
}